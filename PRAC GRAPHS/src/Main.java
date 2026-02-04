
public class Main {

	public static void main(String[] args) {
		
		//GRAPH=> NETWORK OF NODES THAT ARE CONNECTED BY EDGES
		//CREATING A GRAPH
		//INSTATIATING A GRAPH
		
		Graph graph = new Graph(4);// TIT WILL HAVE 4 ROWS AND 4 COLS
		
		//ADDNG NODES INTO THE GRAPH
		//THE GRAAPH TAKE IN THE NODE
		//THE NODE TAKES IN A CHARACTER
		graph.addNode(new Node('A')); //A HAS INDEX OF 0
		graph.addNode(new Node('B')); //B HAS INDEX OF 1
		graph.addNode(new Node('C')); //C HAS INDEX OF 2
		graph.addNode(new Node('D')); //D HAS INDEX OF 3
		
		//ADDING EDGES
		//CREATE EDGHES WITH THE NODES INDECES
		graph.addEdges(0, 1); //A ---> B
		graph.addEdges(1, 2); //B ---> C
		graph.addEdges(2, 3); //C ---> D
		graph.addEdges(2, 1); //C ---> A
		
		//DISPLAY THE GRAPH
		graph.prin();
		
//		    A B C D   
//		  A 0 1 0 0 
//		  B 0 0 1 0 
//		  C 0 1 0 1 
//		  D 0 0 0 0 

	}

}
