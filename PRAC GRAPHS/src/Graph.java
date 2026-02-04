//GRAPH CLASS 

import java.util.ArrayList;

public class Graph {
	
	//A GRAPH IS REPRESENTED BY A 2D ARRAY
	//IT HAS NODE AND EDGES
	int[][] matrix;
	ArrayList<Node> nodes;

	//A GRAPH HAS A SIZE , NUMBER OF ROWS AND COLUMS
	public Graph(int size) {
		
		//INITIALIZE THE GRAPH AS A 2D ARRAY
		//IT TAKES IN THE SIZE OF THE ROWS AND COLUMNS
		matrix = new int[size][size];
		nodes = new ArrayList<>();
		
	}
	
	//ADD NODES IN THE GRAPH
	public void addNode(Node node) {
		nodes.add(node);
		
	}
	
	//ADD EDGES IN THE GRAPH 
	//STARTING AND ENDING POINT OF THE EGDGE
	public void addEdges(int start, int end) {
		matrix[start][end] = 1; //WHEN AN EGDE IS ADDED, WRITE 1'S
	}
	
	
	public boolean checkEdges(int start, int end) {
		if(matrix[start][end] == 1) { //IF THE EGDE EXIST RETURN TRUE
			return true;
		}else {
			return false;//IF IT DOES NOT RETURN FALSE
		}
		
	}
	
	//DISPLAY THE GRAPH
	public void prin() {
		
		//PRINTING OUT THE CHARACTERS/NODES THAT ARE ADDED
		//FOR EACH NODE IN NODES LIST
		System.out.print("  ");
		for (Node node : nodes) {
			//PRINT OUT THEOIR CAHRACTER
			System.out.print(node.data + " ");
		}
		
		System.out.println("  ");
		
		//ITERATING THROUGH THE ROWS
		for(int i =0; i < matrix.length; i++) {
			
			//PRINT OUT CHARACTER FOR EACH ROW
			System.out.print(nodes.get(i).data + " ");
			
			//ITERATING THROUGH THE COLUMNS THAT HAS THE SPECIFIC ROW INDEX
			for(int j =0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");//PRINTING OUT THE GRAPH: ALL ROEWS AND COLUMS
			}
			System.out.println();//EXITING THE LOOP
		}
	}
	
	
	

}
