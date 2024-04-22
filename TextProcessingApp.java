package textprocessingapp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TextProcessingApp {

		    public static void main(String[] args) {
		    	  String text = "Hello, How are you!!";
		            System.out.println("Word count: " + countWords(text));
		            System.out.println("Line count: " + countLines(text));
		            System.out.println("Reversed text: " + reverseText(text));
		            System.out.println("Without duplicates: " + removeDuplicates(text));
		        }
		    

		    // Method to count words in the text
		    private static int countWords(String text) {
		    	    if (text == null || text.isEmpty()) {
		    	        return 0;
		    	    }
		    	    String[] words = text.split("\\s+");
		    	    return words.length;
		    	} 

		    // Method to count lines in the text
		    private static int countLines(String text) {
		      return (int)text.lines().count();  
		    }

		    // Method to reverse the text
		    private static String reverseText(String text) {
		    	if (text == null || text.isEmpty()) {
		            return text;
		        }
		        StringBuilder reversedText = new StringBuilder();
		        for (int i = text.length() - 1; i >= 0; i--) {
		            reversedText.append(text.charAt(i));
		        }
		        return reversedText.toString();
		    }
		    

		    // Method to remove duplicate words from the text
		    private static String removeDuplicates(String text) {
		    	  if (text == null) {
	                    return null;
	                }

	                LinkedHashSet<Character> charSet = new LinkedHashSet<>();
	                for (char c : text.toCharArray()) {
	                    charSet.add(c);
	                }

	                StringBuilder result = new StringBuilder();
	                for (char c : charSet) {
	                    result.append(c);
	                }

	                return result.toString();
	            }

	        }
		

	


