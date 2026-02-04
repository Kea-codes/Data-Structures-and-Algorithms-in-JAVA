import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//ARRAY = USED TO STORE MULTIPLE OBJECTS IN A SINGLE VARIABLE
		String[] Colours = new String[4];//4 SPACES 
		String[] Letters = {"R","T","Y","U"};
		
		//Put elements in the Array
		Colours[0]= "RED";
		Colours[1]= "BLACK";
		Colours[2]= "WHITE";
		Colours[3]= "YELLOW";
		
		
		//REMOVING AND ADDING 
		//CANNOT REMOVE AND ADD BECAUSE OF FIXED SIZE
		
		//LENGTH OR SIZE 
		System.out.println("SIZE OF ARRAY: " + Colours.length);
		
		//SET AN ELEMENT : Set the second element
		Colours[1]= "GREEN"; //it was black at first
		System.out.println("CHANGED 2ND ELEM TO: " + Colours[1]);
		
		//PRINTING THE ARRAY
		System.out.println("PRINTING AN ARRAY: " + Colours);
		//USE A FORLOOP TO PRINT OUT THE ELEMENT
		for(int i=0; i <Colours.length; i++) {
			System.out.println("PRINTING A PROPER ARRAY: " + Colours[i]);
			
		}
		
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//Mutable(can be changed)
		//Dynamic size
		ArrayList<String> friends = new ArrayList<>();
		//Immutable(cannot change the size or elements)
		//Cannot hold primitive data types
		ArrayList<Integer> Friends2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		//get the Index 
		System.out.println("elem in Index 0 (First elen): " + Friends2.get(0) );
		
		//get size of the Array
		System.out.println("Size of the Array:  " + Friends2.size() );
		
		//Add an element
		Friends2.add(9);
		//get the Eighth element
		System.out.println("Added elemnt: " + Friends2.get(7) );

		//Remove the Element
		Friends2.remove(4);// remove the 5th element which is 5
		
		//Print the Array
		System.out.println("Arraylist: " + Friends2);
		
	}

}
