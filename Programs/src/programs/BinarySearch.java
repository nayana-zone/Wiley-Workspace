package programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] A = new int[size];
	        
	        
	        System.out.println("Enter the elements of the array in sorted order:");
	        for (int i = 0; i < size; i++) {
	            A[i] = sc.nextInt();
	        }
	        
	        System.out.println("Enter the element to search for: ");
	        int x = sc.nextInt();
	        
	        int result = binarySearch(A, x);
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	}
	        
	        private static int binarySearch(int[] A, int x) {
	            int p = 0;
	            int r = A.length - 1;

	            while (p <= r) {
	                int q = (p + r) / 2;
	                if (A[q] == x) {
	                    return q;
	                } else if (A[q] > x) {
	                    r = q - 1;
	                } else {
	                    p = q + 1;
	                }
	            }
	            return -1;	
	}

}
