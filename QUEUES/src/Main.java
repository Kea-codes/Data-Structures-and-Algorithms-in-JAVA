import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		//QUEUES
		//STORES ARBITRARY OBJECTS OR ELEMENTS
		//FOLLOWS A FIFI SCHEME
		
		//A QUEUE IS IMPLEMENTED USING A LINKEDLIST
		//CANNOT INSTATIATE A QUEUE BECAUSE IS IS AN INTERFACE
		//MAKING THE QUEUE INTO A STRING TYPE
		Queue<String> pplQueue = new LinkedList<>();
		
		//ADD AT THE BACK add() or offer()
		pplQueue.add("KEA"); //pplQueue.offer("KEA"); 
		pplQueue.add("MOSI");
		pplQueue.add("ALBERT");
		pplQueue.add("GIZ");
		
		//PRINTING OUT THE QUEUE
		System.out.println("PRINTIN THE PEOPLES'S QUEUE: " + pplQueue);
		
		//REMOVING FROMTHE QUEUE remove() or poll()
		pplQueue.remove(); //REMOVED KEA FROM THE QUEUE
		System.out.println("NEW QUEUE: " + pplQueue );
		
		//CHECK NUMBER OF ELEM IN THE QUEUE
		System.out.println("NUM OF ELEM IN A QUEUE CURRENTLY: " + pplQueue.size());

		//CHECK IF QUEUE IS EMPTY
		System.out.println("QUEUE EMPTY: " + pplQueue.isEmpty());
		
		//LOOK AT THE FRONT OF THE QUEUE
		System.out.println("PEEKING AT THE QUEUE: " + pplQueue.peek());
		
		//CHECK IF QUEUE HAS ELEM
		System.out.print("CHECK IF QUEUE CONTAINS GIZ: " + pplQueue.contains("GIZ"));
	}

}
