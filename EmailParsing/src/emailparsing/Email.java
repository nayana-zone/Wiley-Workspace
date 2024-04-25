package emailparsing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Email {

	public static void main(String args[]) {
		
		String emails = "abc@gmail.com,nayana@yahoo.com,dheeksha@outlook.com,anu@gmail.com,xyz@outlook.com,mohak@yahoo.com";
		
		
		 Map<String, List<String>> emailMap = new HashMap<>();
	        emailMap.put("Gmail", new ArrayList<>());
	        emailMap.put("Yahoo", new ArrayList<>());
	        emailMap.put("Outlook", new ArrayList<>());
		
		for(String email : emails.split(",")) {
			
			String domain = email.substring(email.indexOf('@') + 1);
			
			if(domain.equals("gmail.com")) {
				emailMap.get("Gmail").add(email);
			}
			
			if(domain.equals("yahoo.com")) {
				emailMap.get("Yahoo").add(email);
			}
			
			if(domain.equals("outlook.com")) {
				emailMap.get("Outlook").add(email);
			}
		}
		 
		
		 for (Map.Entry<String, List<String>> entry : emailMap.entrySet()) {
	           System.out.println("\n"+entry.getKey() + ":");
	           for (String email : entry.getValue()) {
	              System.out.println(email);
	}

	}
	}
}

/*int maxEmails = 0;
for (List<String> emailsList : emailMap.values()) {
    maxEmails = Math.max(maxEmails, emailsList.size());
}

// Print emails side by side for each category
for (int i = 0; i < maxEmails; i++) {
    for (Map.Entry<String, List<String>> entry : emailMap.entrySet()) {
        List<String> emailsList = entry.getValue();
        if (i < emailsList.size()) {
            System.out.print(emailsList.get(i) + "\t\t");
        } else {
            System.out.print("\t\t\t\t"); // For alignment
        }
    }
    System.out.println();
}*/

