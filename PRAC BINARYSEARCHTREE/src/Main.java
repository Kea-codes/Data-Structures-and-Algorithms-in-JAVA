
public class Main {

	public static void main(String[] args) {
		
		//INSTATIATING THE BINARY TREE CLASS
		BinaraySearchTree bst = new BinaraySearchTree();
		
		//ADDING THE ELEMENTS IN THE TREE
		// ADD RANDOM NUMBERS, THEY WILL BE PUT INN ORDER
		bst.insert(new Node(1));
		bst.insert(new Node(5));
		bst.insert(new Node(7));
		bst.insert(new Node(3));
		bst.insert(new Node(8));
		bst.insert(new Node(6));
		bst.insert(new Node(0));
		bst.insert(new Node(9));
		bst.insert(new Node(2));
		bst.insert(new Node(4));

		//REMOVING ELEMENTS IN THE BST
		bst.remove(3);
		
		//DISPLAY THE BST
		bst.display();
		
	}

}
