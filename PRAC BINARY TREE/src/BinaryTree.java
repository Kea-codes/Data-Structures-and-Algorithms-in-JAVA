//BINARY CLASS
public class BinaryTree {

	//ROOT FOR THE BINARY TREE
	//POINTER TO THE NODE CLASS
	Node root;

	//DEFAULT CONSTRUCTOR
	public BinaryTree() {
		this.root=null;	
	} 
	
	//PRE ODER , POST AND IN ORDER
	
	//PRE ODER (ROOT LEFT RIGHT)
	public void preorder(Node node) {
		//IF THE NODE IS NOT NULL THEN :
		if(node != null) { 
			System.out.print(node.value +" ");// PRINTING OUT THE VALUE OF THE ROOT
			preorder(node.left); // TAKING THE VALUE OF THE LEFT CHILD
			preorder(node.right);//TAKING THE VALUE OF THE RIGHT CHILD
		}
	}
	
	//IN ORDER (LEFT ROOT RIGHT)
	public void inorder(Node node) {
		
		if(node != null) {
			inorder(node.left);
			System.out.print(node.value + " ");
			inorder(node.right);
		}
	}
	
	//POST ORDER (LEFT RIGHT ROOT)
	public void postorder(Node node) {
		
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.value + " ");
		}
	}
	
	
	

}
