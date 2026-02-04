
public class Main {

	public static void main(String[] args) {
		
		
		//GRAPH => A NETWORK OF NODES , THAT ARE CONNECTED BY EDGES
				//INSTANTIATING A GRAPH
				GraphBfs graphBfs = new GraphBfs(5);//5 ROWS AND 5 COLS= SIZE
				
				//ADD THE NODES IN THE GRAPH
				graphBfs.addNode(new Node('A')); // A HAS AN INDEX OF 0
				graphBfs.addNode(new Node('B')); // B HAS AN INDEX OF 1
				graphBfs.addNode(new Node('C')); // C HAS AN INDEX OF 2
				graphBfs.addNode(new Node('D')); // D HAS AN INDEX OF 3
				graphBfs.addNode(new Node('E')); // E HAS AN INDEX OF 4
				
				//ADDING EDGES IN THE GRAPH
				//CONNECTING NODES WITH EDGES , VIA THEIR INDECES
				graphBfs.addEdge(0, 1); // A ----> B
				graphBfs.addEdge(1, 2); // B ----> C
				graphBfs.addEdge(2, 3); // C ----> D
				graphBfs.addEdge(4, 1); // E ----> A
				graphBfs.addEdge(0, 3); // B ----> D
				graphBfs.addEdge(2, 4); // 3 ----> E
				
				//PRINTING OUT THE GRAPH
				graphBfs.print();
				
//				    A B C D E   
//				  A 0 1 0 1 0  
//				  B 0 0 1 0 0  
//				  C 0 0 0 1 1  
//				  D 0 0 0 0 0 
				
				System.out.println("");
				
				//TRAVERSING THROU A GRAPH WITH BFS
				//iT TAKES IN THE INDEX OF THE STARTING POINT
				graphBfs.bfs(0); // START FROM A
				
//				    A B C D E   
//				  A 0 1 0 1 0  
//				  B 0 0 1 0 0  
//				  C 0 0 0 1 1  
//				  D 0 0 0 0 0  
//				  E 0 1 0 0 0  
//
//				  A ---> VISITED
//				  B ---> VISITED
//				  D ---> VISITED
//				  C ---> VISITED
//				  E ---> VISITED
	}

}
