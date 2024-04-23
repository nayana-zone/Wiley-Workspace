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
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            
	            // Writing to a file
	            FileWriter writer = new FileWriter("textFile.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	            
	           
	            do {
	                System.out.println("Enter text to be written: ");
	                String input = reader.readLine();
	                bufferedWriter.write(input);
	                bufferedWriter.newLine();
	                System.out.print("Want to add more? (Y/N): ");
	            } while (reader.readLine().equalsIgnoreCase("Y"));

	            bufferedWriter.close();
	            
	            // Reading from the file
	            FileReader fileReader = new FileReader("textFile.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            
	            System.out.println("Content of the file:");
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
