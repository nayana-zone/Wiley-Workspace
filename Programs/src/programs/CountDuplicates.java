package programs;
import java.util.Arrays;


	public class CountDuplicates{
		public static void main(String args[]) {
			
			int arr1[] = {2,3,1,0};
			int arr2[] = {5,3,2,4};
			int total = countDuplicate(arr1, arr2);
			System.out.println(total);
		}
		
		
		private static int countDuplicate(int[] arr1, int[] arr2) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			int count = 0;
			int i = 0, j = 0;
			
			while(i < arr1.length && j < arr2.length) {
				if(arr1[i] == arr2[j]) {
					count++;
					i++;
					j++;
				}
				else if(arr1[i] < arr2[j]) {
					i++;
				}
				else {
					j++;
				}
			}
			return count;
		}
	}
