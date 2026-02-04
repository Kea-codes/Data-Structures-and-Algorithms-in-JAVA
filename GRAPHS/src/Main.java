
public class Main {

	public static void main(String[] args) {
		
		//GRAPH IS A NETWORK OF NODES THAT ARE CONNECTED BY EDGES
		//CREATE A GRAPH OBJECT
		
		GRAPH graph = new GRAPH(5); //THE GRAPH WILL HAVE 5 ROWS AND 5 COLUMNS
		
		//ADDING ADGES TO THE GRAPH
		//THE GRAPH TAKES IN THE NODE AND THE NODE TAKES IN A CHARACTER
		graph.addNodes(new Node('A')); //A HAS INDEX 0
		graph.addNodes(new Node('B')); //B HAS INDEX 1
		graph.addNodes(new Node('C')); //C HAS INDEX 2
		graph.addNodes(new Node('D')); //D HAS INDEX 3
		graph.addNodes(new Node('E')); //E HAS INDEX 4
		
		//ADDING ADGES TO THE GRAPH
		//EDGES OF NODES ARE ADDED USING THE INDECES OF THE NODES
		graph.addEdges(0, 1);
		graph.addEdges(1, 2);
		graph.addEdges(2, 4);
		graph.addEdges(4, 3);
		graph.addEdges(0, 4);
		
		
		//DISPLAYING THE GRAPH OR PRINTING IT
		graph.prin();
		
//		    A B C D E 
//		  A 0 1 0 0 1 
//		  B 0 0 1 0 0 
//		  C 0 0 0 0 1 
//		  D 0 0 0 0 0 
	}

}
