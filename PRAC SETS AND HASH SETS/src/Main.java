import java.awt.Insets;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.Media;

public class Main {

	public static void main(String[] args) {
		
		//SETS AND HASH SETS
		//SETS => COLLECTION OF UNIQUE ELEMENTS
		//NO DUPLICATES
		//NO ORDER
		
		//A SET IS AN INTERFACE , SO TO IMPLEMENT A SET YOU NEED A HASH SET
		//TYPE STRING
		Set<String> names = new HashSet<>();
		
		//ADDING ELEM IN THE SET
		//THERE IS A DUPLICATE, WHEN PRINTED IT WILL BE IGNORED
		names.add("KEA");
		names.add("MOSI");
		names.add("MOSA");
		names.add("GIZ");
		names.add("KEA");
		
		//PRINT OUT THE ORIGINAL SET
		System.out.println("ORIGINAL SET: " + names);
		
		//CHECK IF THE SET IS EMPTY
		System.out.println("SET IS EMPTY: " + names.isEmpty());
		
		//CHECK IF THE SET CONTAINS A CERTAIN ELEMENT
		System.out.println("KEA IS IN THE SET: " + names.contains("KEA"));
		
		//THE SIZE OF THE SET
		System.out.println("SIZE OF THE SET: " + names.size());
		
		//REMOVE AN EMELENT
		names.remove("KEA");
		System.out.println("NEW SET: " + names);
		
		//PRINT OUT THE ELEMENTS OF THE SET 1 BY 1
		//FOR EACH NAME IN NAMES SET: PRINT IT
		for (String name : names) {
			System.out.println("PRINT OUT THE NAME: " + name + " ");
		}
		
		//CLEAR OUT ALL THE ELEMENTS IN THE SET
		names.clear();
		System.out.println("CLEARD SET: " + names);

	}

}
