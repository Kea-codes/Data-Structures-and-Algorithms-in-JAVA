//BINARY TREE CLASS



public class BinaraySearchTree {

	//ROOT NODE OF THE TREE
	Node root;
	
	//NO NEED FOR A DEFAULT CONSTRUCTOR
	
	//INSERT: THE NODE IN THE TREE
	//ORDER: LEFT < ROOT < RIGHT
	public void insert(Node root) {
		root = insertHelper(root, root);
	}
	private Node insertHelper(Node root, Node node) {
		
		//THE VALUE OF THE NODE IS EQUAL TO THE VALUE WE ARE INSERTING
		int value = node.value;
		
		//IF THE ROOT IS EMPTY
		 if(root == null) {
			 root = node;//LET THE NODE THAT IS BEING INSERED TO BE THE ROOT
			 return root;//RETURN THE NEW ROOT
		 }else if (value < root.value) { //IF THE NODE VALUE BEING INSERTED IS LESS THAN THE CURRENT ROOT'S VALEU
			
			 root.left = insertHelper(root.left, node);
		}else {
			
			root.right = insertHelper(root.right, node);
		}
		
		return root;
		
	}
	
	//DISPLAY
	public void display() {
		displayHelper(root);
	}
	//IN - ODER TRAVESAL LEFT ROOT RIGHT
	private void displayHelper(Node root) {
		
		if(root != null) {
			//recursion
			displayHelper(root.left);
			System.out.print(root.value + " ");
			displayHelper(root.right);
		}
		
	}
	
	//SEARCH
	public boolean search(int value) {
		return searchHelper(root, value);
		
	}
	private boolean searchHelper(Node root, int value) {
		
		if(root == null) {
			return false; //IF ITS NULL THEREFORE TREE IS EMPTY
		}else if (root.value == value) {
			return true;
		}else if (value < root.value) {
			return searchHelper(root.left, value);
		}else {
			return searchHelper(root.right, value);
		}
				
		
	}
	
	//REMOVE
	public void remove(int value) {
		
	if(search(value)) {
		removehelper(root, value);
	}
		
	}
	private Node removehelper(Node root , int value) {
		
		if (root == null) {
			return root;
		}else if (value < root.value ) {
			root.left = removehelper(root.left, value);
		}else if(value > root.value) {
			root.right = removehelper(root.right, value);
		}else {	//ELSE : THE ROOT THAT IS BEING REMOVED HAS CHILDREN
			 if(root.left == null && root.right==null)		{
				 return null;
			 }else if (root.right != null) {
				root.value = successor(root);
				root.right= removehelper(root.right, value);
			}else {
				root.value = predecessor(root);
				root.left= removehelper(root.left, value);
			}
			
		}
		
		return root;
	}
	private int predecessor(Node root) {
		root = root.right;
		
		while(root.left != null) {
			root= root.left;
		}
		return root.value;
	}
	private int successor(Node root) {
		root = root.left;
		
		while(root.right != null) {
			root= root.right;
		}
		return root.value;
	}
	
	
}
