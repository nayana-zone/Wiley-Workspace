package lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaCollection {

	public static void main(String[] args) {
		
		List<String>names=new ArrayList<>(List.of("Nayana","Dheeksha","Anusha"));
		
		for(int i = 0; i<names.size();i++) {
			names.set(i, names.get(i).toUpperCase());
		}
		
	
	 for (String name : names) {
         System.out.println(name);

	}
	}
}

