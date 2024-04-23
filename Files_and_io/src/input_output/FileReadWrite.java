package input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWrite {

	public static void main(String[] args) {
		  try {
	            // Input from the user
	            Scanner scanner = new Scanner(System.in);
	            
	            // Writing to a file
	            FileWriter writer = new FileWriter("textFile.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	            
	           
	            do {
	                System.out.print("Enter text to be written: ");
	                String input = scanner.nextLine();
	                bufferedWriter.write(input);
	                bufferedWriter.newLine();
	                System.out.print("Want to add more? (Y/N): ");
	            } while (scanner.nextLine().equalsIgnoreCase("Y"));

	            bufferedWriter.close();
	            
	            // Reading from the file
	            FileReader fileReader = new FileReader("textFile.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            System.out.println("Content of the file:");
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	            bufferedReader.close();
	            scanner.close(); 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

