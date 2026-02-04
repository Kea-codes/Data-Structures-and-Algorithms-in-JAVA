
public class Main {

	public static void main(String[] args) {
		
		//INSTATIATING THE BinarySearchTree (CREATING AN OBJECT)
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		//INSERT VALUES IN THE BINARY TREE
		//INSERT THEM WITHOUT ANY ORDER RANDOMLY, THEY WILL BE SORTED
		//INSERT FUNC TAKES IN A NODE THE THE NODE TAKE IN THE VALUE OF THE INSERTED NODE
		binarySearchTree.insert( new Node(6));
		binarySearchTree.insert( new Node(3));
		binarySearchTree.insert( new Node(1));
		binarySearchTree.insert( new Node(9));
		binarySearchTree.insert( new Node(7));
		binarySearchTree.insert( new Node(5));
		binarySearchTree.insert( new Node(2));
		binarySearchTree.insert( new Node(0));
		binarySearchTree.insert( new Node(4));
		binarySearchTree.insert( new Node(8));
		
		
		//REMOVED NODES
		binarySearchTree.remove(6);
		binarySearchTree.remove(5);
		binarySearchTree.remove(7);
		binarySearchTree.remove(9);
		
		
		//DISPLAY THE INSERTED NODES
		binarySearchTree.display();
		
		
		
	}

}
