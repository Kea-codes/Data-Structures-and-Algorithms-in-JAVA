
public class Main {

	public static void main(String[] args) {
		
		//INSTANTIATING BINARYTREE
		BinaryTree binarytree = new BinaryTree();
		
		//        1
		//       / \
		//      2   3
		//     /\    \
		//    4  5    6
		
		//ADDING THE ABOVE ELEMENTS IN THE BNARY TREE
		binarytree.root = new Node(1);
		binarytree.root.left = new Node(2);
		binarytree.root.right = new Node(3);
		binarytree.root.left.left = new Node(4);
		binarytree.root.left.right = new Node(5);
		binarytree.root.right.right = new Node(6);
		
		//PRINTING OUT THE TRAVERSALS 
		
		//IN ORDER
		System.out.print("IN ORDER: ");
		binarytree.inorder(binarytree.root);
		System.out.println(" ");
		
		//PRE ORDER
		System.out.print("PRE ORDER: ");
		binarytree.preorder(binarytree.root);
		System.out.println(" ");
		
		//POST ORDER
		System.out.print("POST ORDER: ");
		binarytree.postorder(binarytree.root);
		
	}

}
