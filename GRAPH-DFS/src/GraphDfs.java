
import java.util.ArrayList;

//THE GRAPH CLASS WITH A DFS ALGO
public class GraphDfs {
	
	//A GRAPH IS A 2-D ARRAY
	int[][] matrix;
	ArrayList<Node> nodes;//ARRAY TYPE OF NODE CLASS

	//THE SIZE OF ROWS AND COLUMNS
	public GraphDfs(int size) {
		//THE SIZE OF THE GRAPH
		matrix = new int[size][size];
		nodes = new ArrayList<>();//INITIALIZE THE NODES ARRY LIST
	}
	
	//ADD NODES IN THE GRAPH
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	//ADD EDGES IN THE GRAPH
	//EDGES HAVE A STATING POINT AND AN ENDING POINT
	public void addEdge(int start, int end) {
		matrix[start][end]=1;//SHOW EXISTANCE OF EDGES BY 1
	}
	//CHECK IF EDGES EXIST
	public boolean checkEdges(int start, int end) {
		//IF THE EDGE EXIST
		if (matrix[start][end] == 1) {
			return true; //RETURN TRUE IF EDGE EXIST
		}else {
			return false; //RETURN FALSE IF EDGE DOES NOT EXIST
		}
		
	}
	
	//PRINT OUT THE GRAPH
	public void print() {
		//PRINTING OUT THE CHARACTERS/ NODESS INSERTED
		//FOR EACH NODE IN NODES LIST
		System.out.print("  ");
		for (Node node : nodes) {
			System.out.print(node.data + " ");
		}
		
		//ALIGNING THE GRAPH
		System.out.println("  ");
		
		//PRINTING OUT THE EDGES THAT ARE INSERTED
		//PRINT OUT A 2D MATRIX OF ADJECENCY MATRIX
		for(int i=0; i < matrix.length ; i++ ) {
			
			//PRINTING OUT THE NODES FOR EVERY ROW
			System.out.print(nodes.get(i).data + " ");
			
			
			//PRINTING COLUMNS THAT ARE ARE CONNECTED TO THE CERTAIN ROW INDEX 
			for(int j=0; j < matrix[i].length ; j++ ) {
				//PRINTING OUT THE 2D ARRAY
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" "); //EXITING THE MATRIX
		}
		
	}
	 
	//DFS METHOD
	//IT TAKES IN THE STARTING POINT/NODE
	 public void dfs(int start) {
		//CREATE A BOOLEAN ARRAY OF VISITED NODES
		//TAKES IN THE MATRIX SIZE
		 boolean[] visited = new boolean[matrix.length];
		 //HELPER FUNC
		 //TAKES IN THE STARTING POINT AND VISITED
		 dfsHelper(start, visited);
	}
	//DFS HELPER METHOD THAT USES RECURSION
	 private void dfsHelper(int start , boolean[] visited) {
		//CHECK IF THE CURRENT NODE IS VISITED
		 if (visited[start]) {//IF VISITED
			return;
		}else {
			visited[start] = true;
			//PRINT OUT THE THE VISITED NODES
			System.out.println(nodes.get(start).data + " --> VISITED ");
		}
		 
		 //ITERATE THROUNG THE ROWS AND CHECK WHICH NODES ARE CONNECTED BY EDGES
		 //
		 for (int i = 0; i< matrix[start].length; i++) {
			if (matrix[start][i] == 1) {// CHECK IF THERE IS ANY EDGE BY SEARCHING FOR 1'S
				//RECURSION
				dfsHelper(i, visited);
			}
			
		}
		 //IF WE SUCCESSFULY SEARCH THRU THE ENTIRE ROW, LETS RETUR
		 return;
		 
		 
	}
	
	
	

}
