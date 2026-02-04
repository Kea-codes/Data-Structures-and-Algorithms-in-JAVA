

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//THE GRAPH CLASS WITH A DFS ALGO
public class GraphBfs {
	
	//A GRAPH IS A 2-D ARRAY
	int[][] matrix;
	ArrayList<Node> nodes;//ARRAY TYPE OF NODE CLASS

	//THE SIZE OF ROWS AND COLUMNS
	public GraphBfs(int size) {
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
	
	//IMPLEMENTING A BFS METHOD
	public void bfs(int start) {//takes in the index of the starting point
		
		//FALLOWS A FIFO SCHEME THEREFOREB IT USES A QUEUE
		//IMPLEMENT A QUEUE USING A LINKED LIST BECAUSE Queue<> IS AN INTERFACE
		Queue<Integer> queue = new LinkedList<>();
		
		//CREAT A BOOLEAN ARRAY OF VISITED
		//TAKES IN THE SIZE OF THE MATRIZ
		boolean[] visited = new boolean[matrix.length];
		
		//A STARTING NODE TO A QUEUE
		queue.add(start);
		//visited starting node
		visited[start] = true;
		
		//CONTINUE WITH THE SIZE OF THE QUEUE IS NOT EMPTY(0)
		while (queue.size() != 0) {
			//PULL THE NEIGHBOURS OF THE STARTING POINT
			start = queue.poll();
			System.out.println( nodes.get(start).data +" ---> VISITED");
			
			//ITERATE THROUGH THE ROWS LOOKING FOR ADJECENT NODES THAT ARE NEIGHBOURS
			for (int i=0; i < matrix[start].length; i++) {
				//IF THE MATRIX IS ADJECENT AND NOT VISISTED, ADD IT TPO THE QUEUE
				if(matrix[start][i] == 1 && !visited[i]) {
					queue.add(i);//ADD THE COLUMN TO THE QUEUE
					visited[i] = true;
				}
				
			}
		}
		
		
		
	}
	
}
