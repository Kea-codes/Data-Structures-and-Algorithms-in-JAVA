
public class Main {

	public static void main(String[] args) {

		// INSTATIATING THE BINARY TREE (CREATING AN OBJECT)
		BINARYTREE binarytree = new BINARYTREE();

		// MANUALLY BUILD A BINARY TREE
		//
		// 1
		// / \
		// 2 3
		// / \ \
		// 4 5 6

		// ADDING THE VALUES IN THE BINARY TREE
		binarytree.root = new Node(1);
		binarytree.root.left = new Node(2);
		binarytree.root.right = new Node(3);
		binarytree.root.left.left = new Node(4);
		binarytree.root.left.right = new Node(5);
		binarytree.root.right.right = new Node(6);

		// IN ORDER TRAVERSAL
		System.out.print("IN ORDER: ");
		binarytree.inorder(binarytree.root);
		System.out.println(" ");

		// PRE ORDER TRAVERSAL
		System.out.print("PRE ORDER: ");
		binarytree.preorder(binarytree.root);
		System.out.println(" ");

		// POST ORDER TRAVERSAL
		System.out.print("POST ORDER: ");
		binarytree.postoder(binarytree.root);
	}

}
