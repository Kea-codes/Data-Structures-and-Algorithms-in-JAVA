

//GRAPH CLASS

import java.util.ArrayList;

public class GRAPH {

	//A GRAPH SHOUT BE A 2D MATRIX
	int [][] matrix;//A MATRIX HAS ROWS AND COLUMS

	//ARRAY OF NODES
	ArrayList<Node> nodes;//THE ARRAY LIST OF TYPE NODE CLASS 
	
	//THE GRAPH TAKES IN THE SIZE OF THE IT: NUM OF ROWS AND COLUMS
	public GRAPH(int size) {
		nodes = new ArrayList<>();
		matrix= new int[size][size];//THE SIZE IS THE NUM OF ROWS AND COLUMS
	}
	
	//ADD NODES
	public void addNodes(Node node) { //TAKES IN A NODE THAT IS BEING ADDED TO THE GRAPH
		nodes.add(node);
	}
	//ADD EGDES
	//EDGES START AND END SOMWHERE
	public void addEdges(int start, int end) {
		matrix[start][end] = 1; //WHEN AN EGDE IS ADDED, WRITE 1'S
	}
	//CHECK IF EDGES EXIST
	public boolean checkEdge(int start, int end) {
		if(matrix[start][end] == 1) { //IF THE EGDE EXIST RETURN TRUE
			return true;
		}else {
			return false;//IF IT DOES NOT RETURN FALSE
		}
		
	}
	//PRINT THE GRAPH
	public void prin() {
		System.out.print("  ");
		//PRINTING OUT ADDED NODES
		for (Node node : nodes) {
			System.out.print(node.data + " ");
		}
		System.out.println();
		
		//ITERATING THROUGH THE ROWS
		for(int i =0; i < matrix.length; i++) {
			
			System.out.print(nodes.get(i).data + " ");
			//ITERATING THROUGH THE COLUMNS THAT HAS THE SPECIFIC ROW INDEX
			for(int j =0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");//PRINTING OUT THE GRAPH: ALL ROEWS AND COLUMS
			}
			System.out.println();//EXITING THE LOOP



		}
	}
	
	
}
