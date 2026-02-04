
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//ARRAY LIST HAS NO FIXED SIZE LIKE ARRAYS
		
		//Instantiating the arraylist (creating an object)
		//type String Array list
		//cannot hold primitive data types eg <int> <boolean>
		
		ArrayList<Integer> Friends = new ArrayList<>();
		
		//Adding
		Friends.add(0);
		Friends.add(1);
		Friends.add(2);
		Friends.add(3);
		Friends.add(4);
		Friends.add(5);
		
		System.out.println("ARRAY LIST OF FRIENDS: " + Friends);		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//immutable (cannot change)
		ArrayList<String> friends2= 
				new ArrayList<>(Arrays.asList("KEA", "MOSI", "TSHEPO","MOSA" ));
		
		//get index
		System.out.println("Get first Index: " + friends2.get(0));
		
		//get Size of the Arraylist
		System.out.println("Size Of the Array: " + friends2.size());
		
		//add Element, 
		friends2.add("TSHIAMO");
		System.out.println("get the 5th elem from 4th index:  " +  friends2.get(4));
		
		//set Elem
		friends2.set(0, "KAM");// setting the first elem to be kam
		System.out.println("Get changed first elem: " + friends2.get(0));
		
		//Removing an elem
		friends2.remove(4); //or friends2.remove("TSHIAMO")
		
		//Print out the ArrayList
		System.out.println(friends2);
		
		

	}

}
