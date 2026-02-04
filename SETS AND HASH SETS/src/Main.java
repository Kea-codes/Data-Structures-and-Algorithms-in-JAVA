import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	public static void main(String[] args) {
		
		//SETS AND HASH SETS
		//SETS => CPLLECTION OF UNIQUE ELEMENTS
		//NO DUPLICATES ARE ALLOWED
		//NO ORDER
		
		//USE A HASHSET<> TO IMPLEMENT A SET, DO NOT USE
		//A SET<>()	BECAUSE IT IS AN INTERFACE
		
		//CREAT A SET OF NAMES
		//TYOE STRING
		Set<String> names = new HashSet<>();
		
		//ADDING TO A SET
		//NOTICE THAT KEA HAS A DUPLICATE, IT WILL BE IGNORED
		names.add("KEA");
		names.add("MOSI");
		names.add("MOSA");
		names.add("GIZ");
		names.add("KEA");
		
		//PRINTING OU THE SET
		System.out.println("ORIGINAL SET OF NAMES(ORDER DOES NOT MATTER): " + names);
		
		//CHECKING IF THE SET IS EMPTY
		System.out.println("SET IS EMPTY: " + names.isEmpty());
		
		//CHECKING THE SIZE OF THE SET
		System.out.println("SIZE OF THE SET: " + names.size());
		
		//REMOVING AN ELEMENT FROM THE SET
		names.remove("MOSA");
		System.out.println("PRINTING NEW SET(REMOVED MOSA): " + names);
		
		//PRINTING OUT THE WHOLE SET OF NAMES 1 BY 1
		//FOR EACH NAME IN NAMES , PRINT THEM OUT
		for (String name: names) {
			
			System.out.println("PRINT OUT FOR EACH NAME : " + name + " ");
		}
		
		//CHECK IF THE SET CONTAINS AN ELEMENT
		System.out.println("SET CONTAINS KEA: " + names.contains("KEA"));
		
		//CLEARING OUT THE WHOLE SET
		names.clear();
		System.out.print("CLEARD SET: " + names );
		
		
		
		
		
	}

}
