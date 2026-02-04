import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("+++++++++++++++++++++STACKS+++++++++++++++++++++++++");
		//STACKS
		//FOLLOWS A LIFO SCHEME
		//STORE ARBITRARY OBJECTS OF ELEMENTS
		
		//INSTANTIATING AND INITIALIZING 
		Stack<String> movieStacks = new Stack<>();
		
		//ADDING ELEM IN THE STACK
		movieStacks.add("RAMBO");
		movieStacks.add("ROCKY");
		movieStacks.add("CREED");
		movieStacks.add("JOHN WICK");
		
		//PRINTING OUT THE STACK
		System.out.println("PRINTING THE STACK AFTER ADDING: " + movieStacks);
		
		//CHECKING IF THE STACK IS EMPTY
		System.out.println("STACK IS EMPTY: " + movieStacks.isEmpty());
		
		//REMOVE AN ELEMENT
		String removedelem = movieStacks.pop();
		System.out.println("REMOVED ELEM: " + removedelem);
		//PRINTING OUT THE NEW STACK
		System.out.println("NEW STACK: " + movieStacks);
		
		//LOOKING FROM THE TOP FO THE STACK
		System.out.println("TOP ELEM IN THE STACK: " + movieStacks.peek());
		
		//CHECK IF THE STACK CONTAINS A CERTAIN ELEM
		System.out.println("POSITION OF THE RAMBO MOVIE: " + movieStacks.search("RAMBO"));
		System.out.println("CONTAINS RAMBO: " + movieStacks.contains("RAMBO"));
		
   //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println("+++++++++++++++++++++QUEUES+++++++++++++++++++++++++");
		
		//QUEUES
		//IT FOLLOWS A FIFO SCHEME 
		//STORES ARBITRARY OBJECTS OR ELEMENTS
		//QUEUE IS IMPLIMENTED USING A LINKED LIST  
		//CANNOT USE A QUEUETO IMPLENET IT BECAUSE IT IS AN INTERFACE
		
		Queue<String> pplQueue = new LinkedList<>();
		
		//ADDING ELEMENTS AT THE BACK OF THE QUEUE QUEUE add()/offer()
		pplQueue.add("KEA");
		pplQueue.add("MOSI");
		pplQueue.add("GIZ");
		pplQueue.add("ALBERT");
		
		//PRINTING OUT THE QUEUE
		System.out.println("QUEUE OF PEOPLE: " + pplQueue);
		
		//CHECKING IF THE QUEUE IS EMPTY
		System.out.println("THE QUEUE IS EMPTY: " + pplQueue.isEmpty());
		
		//REMOVE AN ELEMENT FROM THE FRONT poll()/remove()
		String removeElem = pplQueue.remove();
		System.out.println("REMOVED ELEM FROM THE QUEUE: " + removeElem);
		//PRINTING OUT THE NEW QUEUE
		System.out.println("NEW QUEUE: " + pplQueue);
		
		//CHECKING THE FRONT ELEM IN THE QUEUE
		System.out.println("FRONT ELEM IN THE QUEUE: " + pplQueue.peek());
		
		//SEARCHING FOR A PARTICULAR ELEM IN THE QUEUE
		System.out.println("QUEUE CONTAINS GIZ: " + pplQueue.contains("GIZ"));
		
	}

}
