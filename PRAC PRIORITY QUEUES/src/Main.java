import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
	
		//PRIORITY QUEUE
		//IT FOLLOWS THE FIFO SCHEME
		//IT PRIORITIZES THE ELEMENTS WITH THE HIGHEST PRIORITY
		
		//INITIALIZING THE PRIORITY QUEUE
		Queue<Integer> pq = new PriorityQueue<>();
		
		//ADDING IN THE QUEUE add() or offer()
		pq.add(7);
		pq.add(3);
		pq.add(1);
		pq.add(6);
		pq.add(9);
		pq.add(5);
		pq.add(4);
		pq.add(2);
		pq.add(10);
		pq.add(8);
		
		//DISPLAYING THE ELEMENTS pulled from the queue 
		//TO MEET A CERTAIN PRIORIRTY
		while (!pq.isEmpty()) {//WHILE THE QUEUE IS NOT EMPTY
			
			System.out.print( pq.remove() + " ");
			
		}
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		System.out.println( );
		System.out.println( "-------------------------------------");
		
		
		//REVERSING THE ORDERED QUEUE, TO MEET A CERTION PRIORITY
		Queue<String> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		
		//ADD THE ELEM IN THE QUEUE
		pq2.add("G");
		pq2.add("B");
		pq2.add("D");
		pq2.add("F");
		pq2.add("J");
		pq2.add("H");
		pq2.add("A");
		pq2.add("C");
		pq2.add("E");
		pq2.add("I");
		
		//DISPLAY THE REVERSED ODERED TO MEET A CERTAIN PRIORITY
		while (!pq2.isEmpty()) {
			System.out.print(pq2.remove() + " "); //J I H G F E D C B A
			
		}

	}

}
