

public class Main {

	public static void main(String[] args) {
		
		
		//DFS = DEPTH FIRST SEARCH
		//    => VISIT A NODE AND KEEP GOING UNTIL YOU RAECH A DEAD END
		//    => BACKTRACK TO THE LAST NODE THAT HAS UNVISITED ADJECENT NEIGHBOURS
		
		//GRAPH => A NETWORK OF NODES , THAT ARE CONNECTED BY EDGES
		//INSTANTIATING A GRAPH
		GraphDfs graphDfs = new GraphDfs(5);//5 ROWS AND 5 COLS= SIZE
		
		//ADD THE NODES IN THE GRAPH
		graphDfs.addNode(new Node('A')); // A HAS AN INDEX OF 0
		graphDfs.addNode(new Node('B')); // B HAS AN INDEX OF 1
		graphDfs.addNode(new Node('C')); // C HAS AN INDEX OF 2
		graphDfs.addNode(new Node('D')); // D HAS AN INDEX OF 3
		graphDfs.addNode(new Node('E')); // E HAS AN INDEX OF 4
		
		//ADDING EDGES IN THE GRAPH
		//CONNECTING NODES WITH EDGES , VIA THEIR INDECES
		graphDfs.addEdge(0, 1); // A ----> B
		graphDfs.addEdge(1, 2); // B ----> C
		graphDfs.addEdge(2, 3); // C ----> D
		graphDfs.addEdge(4, 1); // E ----> A
		graphDfs.addEdge(0, 3); // B ----> D
		graphDfs.addEdge(2, 4); // 3 ----> E
		
		//PRINTING OUT THE GRAPH
		graphDfs.print();
		
//		    A B C D E   
//		  A 0 1 0 0 0  
//		  B 0 0 1 1 0  
//		  C 0 0 0 1 1  
//		  D 0 0 0 0 0 
		
		System.out.println();
		System.out.println("VISITED NODES FROM THE START TO END :");
		
		//DFS
		//PASS IN THE INDEX OF THE STARTING POINT
		graphDfs.dfs(0); //START FROM A
		
//		  A B C D E   
//		  A 0 1 0 1 0  
//		  B 0 0 1 0 0  
//		  C 0 0 0 1 1  
//		  D 0 0 0 0 0  
//		  E 0 1 0 0 0  
//
//		  VISITED NODES FROM THE START TO END :
//		  A --> VISITED 
//		  B --> VISITED 
//		  C --> VISITED 
//		  D --> VISITED 
//		  E --> VISITED
		
		
	}

}
