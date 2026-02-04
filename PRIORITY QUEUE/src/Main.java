
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		//PRIORITY QUEUE
		//IT FOLLOWS A FIFO SCHEME(FIRST IN FIRST OUT)
		//SETS OR ATTENDS TO THE ELEMENTS THAT HAVE THE HIGHEST PRIOTITY FIRST
		
		/*LETS SAY YOU HAVE A MARATHON AT SCHOOL
		 * AND 5 PEOPLE ARE RACING FOR A TROPHY
		 * AND YOU NEED TO GIVE OUT THE MEDALS ACCORDING 
		 * TO WHO CROSSEED THE LINE FIRST (IN THAT ORDER)
		 * NOW YOU HAVE VALUES TO ARRANGE IN ORDER
		 * */
		
		
		
		//IMPLEMENTING A PRIORITY QUEUE
		Queue<Integer> pq = new PriorityQueue<>();
		
		//ADD THE ELEMENTS IN THE PRIORITY QUEUE add() or offer()
		//ADD THE VALUES RANDOMLY, THEY WILL BE SORTED
		pq.add(1);
		pq.add(5);
		pq.add(3);
		pq.add(2);
		pq.add(4);	
		
		
		//DISPLAYING THE PQ
		while (!pq.isEmpty()) { //WHILE THE QUEUE IS NOT EMPTY
			//REMOVE EACH ELEMENT AND DISPLAY IT 
			System.out.print("THE TROPHY GOES TO: " +pq.remove() + " "); //1 2 3 4 5 
		}
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		/*LETS SAY YOU ARE TUTOR AND A GRADER OF LEARNERS TESTS
		 * U GRADE THEM WITH (A OR B OR C UNTIL E)
		 * A => IS THE HIGHEST GRAADE AND E => IS THE LOWEST
		 * SO IT MEANS THAT THE ONES WITH THE LOWEST  GRADE NEED YOUR TIME MORE
		 * NOW YOU NEED TO PRIORETIZE LEARNERS WHO GOT LOW GRADES SO THAT U CAN TUTOR THEM MORE
		 * 
		 * */
		
		//IMPLEMENT A PRIORITY QUEUE
		Queue<String> pQueue = new PriorityQueue<>(Collections.reverseOrder());//:A B C D E WILL BE AN OUTPUT
		//WE NEED TO REVERSE THE OUT PUT INTO:  E D C B A
		
		//ADD ELEMENTS IN TO THE PRIORITY QUEUE
		pQueue.add("B");
		pQueue.add("C");
		pQueue.add("E");
		pQueue.add("A");
		pQueue.add("D");
		
		//DISPLAYING THE PRIORITY QUEUE
		while (!pQueue.isEmpty()) {//WHILE THE QUEUE IS NOT EMPTY
			//REMOVE THE ELEMENT AND DISPLAY IT: remove() or poll()
			System.out.print("LEARNERS GETTING THE FIRST PRIORITY/ MORE TIME : " + pQueue.remove() + " "); //ITS GONNA OUTPUT : A B C D E 
			//BUT WE NEED THA IS REVERSE , REMEMBER THE PROBLEM STATEMENT
			
		}
		
		
		
	}
	

}
