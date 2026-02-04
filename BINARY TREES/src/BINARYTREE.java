//BINARY TREE CLASS  import java.awt.geom.NoninvertibleTransformException;

public class BINARYTREE {
	
	//CREATING A NODE CLASS OBJECT
	Node root;

	//DEFAULT CONSTRUCTOR
	public BINARYTREE() {
		
		this.root=null;
	}
	
	//A BINARY TREE HAS THREE TRAVERSALS , POST , PRE AND IN-ORDER
	
	//PRE ORDER ( ROOT LEFT RIGHT)
	public void preorder(Node node) {
		
		//IF THE NODE IS NOT NULL THEN GO START AT :
		if(node != null) {
			//TAKING THE VALUE OF THE ROOD NODE
			System.out.print(node.value + " ");
			//TAKING THE LEFT NODE VALUE
			preorder(node.left);
			//TAKING THE RIGHT NODE VALUE
			preorder(node.right);
		}
	}
	
	//IN ORDER (LEFT ROOD RIGHT)
	public void inorder(Node node) {
		
		//IF THE NODE IS NOT NULL THEN GO START AT :
		if(node != null ) {
			//TAKING THE LEFT NODE VALUE
			inorder(node.left);
			//TAKING THE ROOT VALUE
			System.out.print(node.value + " ");
			//TAKING THE RIGHT VALUE
			inorder(node.right);
		}
	}
	
	//POST ORDER TRAVERSAL ( LEFT RIGHT ROOT)
	public void postoder(Node node) {
		
		//IF THE NODE IS NOT NULL
		if(node !=null) {
			//START TAKING THE LEFT NODE
			postoder(node.left);
			//START TAKING THE RIGHT
			postoder(node.right);
			//TAKE THE VALUE OF THE ROOT
			System.out.print(node.value + " ");
				
				
		}
		
	}
	
	
}
