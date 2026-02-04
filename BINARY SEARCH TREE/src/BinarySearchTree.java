//CLASS FOR THE BINARY SEARCH TREE
public class BinarySearchTree {
	
	//CREATING A ROOT
	//POINTING TO THE NODE CLASS
	Node root;
	
	//
	public BinarySearchTree() {
		
	}
	
	//METHOD OF INSERTING A NODE
	//TAKES IN A NODE
	public void insert(Node node) {
		//ASSIGN A ROOT NODE 
		root = insertHelper(root, node);
	}
	//HELPER METHOD FOR THE insert FUNCTIO
	//TAKES IN THE ROOT AND THE NODE
	private Node insertHelper(Node root, Node node) {
		
		//NODE DATA (NODE IS THE ONE WE INSERTING INTO THE BINARY TREE
		int value = node.value;
		
		//CHECKING IF THE ROOT NODE IS ASSIGNED OR NOT
		if(root == null) {//IF THE ROOT IS NULL THE:
			root = node; //ASSIGNING THE ROOT
			return root; //RETUEN THE ROOT
		}else if(value < root.value) { //IF THE VALUE INSERTED IS LESS THAN THE ROOT VALUE
			//USING RECURSION
			root.left = insertHelper(root.left, node);// ASSIGN THE NODE AS THE LEFT CHILED OF THE ROOT
		}else{
			
			root.right = insertHelper(root.right, node);// ASSIGN THE NODE AS THE RIGHT CHILED OF THE ROOT
		}
		
		return root;// RETURNING THE CURRENT ROOT NODE
	}
	
	
	//DISPLAY METHOD TO SHOW THE BINARY TREE
	public void display() {
		displayHelper(root); //INVOKE THE HELPER METHOD
		//DISPLAY THE ROOT
	}
	//HELPER METHOD FOR THE DISPLAY
	
	//DISPLAYIN THE NODE IN-ODER TRAVERSAL (LEFT ROOT RIGHT)
	private void displayHelper(Node root) {
		//CHECK THE ROOT NODE OF THE SUB-TREE DOES NOT EQUAL NULL
		if(root != null) {
			//DISPLAYIN THE NODE IN-ODER TRAVERSAL (LEFT ROOT RIGHT)
			//USE RECURSION
			displayHelper(root.left);
			System.out.print(root.value + " "); //THE VALUES WILL BE I INCREASING ORDER
			displayHelper(root.right);			//SO THEY CAN BE PUT IN REVERSE (DECREASING ORDER)
												//TO PUT THEM IN DECREASING ORDER (ROOT.RIGHT , THEN ROOT.LEFT)
		}
		
	}

	
	//SEARCHING FOR THE NODE IN THE TREE METHOD
	//ORDER OF THE BINARY TREE: LEFT < ROOT < RIGHT
	public boolean search(int value) {
		return searchHelper(root, value);
	}
	//HELPER METHOD FOR SEARCH
	private boolean searchHelper(Node root , int value) {
		//CHECK IF ROOT IS EQUAL TO NULL
		if(root == null) {
			return false; //IF ITS NULL THEREFORE THE TREE IS EMPTY, AND WE CANNOT SEARCH FOR ANYTHING
			
		}else if(root.value == value){
			return true;//THEREFORE WE FOUND THE MATCH IN THE TREE
			
		}else if(   value < root.value  ) {// VALUE WE LOOKING FOR <  IF CURRENT ROOT
			return searchHelper(root.left, value); //THE WE GO LEFT
			
		}else {//ELSE VALUE WE LOOKING FOR 	>  IF CURRENT ROOT
			return searchHelper(root.right, value); //THE WE GO RIGHT
		}
		
	}
	
	
	//REMOVING NODE METHOD 
	//TAKES IN VALUE OF THE NODE
	public void remove(int value) {
		//CHECK IF THE VALUE EXIST FIRST BEFORE REMOVING
		if(search(value)) {//SEARCH FOR THE VALUE
			removeHelper(root, value);//AFTER FINDING IT REMOVE IT
			
		}else {//ELSE WHEN THE VALUE IS NOT FOUND IN THE TREE
			System.out.println(value + " NOT BE FOUND ");
		}
	}
	//REMOVE HELPER FUNCTION
	public Node removeHelper(Node root, int value) {
		//CHECK TO SEE IF THE ROOT NODE IS WQUAL TO NULL
		if(root == null) {
			return root;//RETURN THE ROOT NODE IF IT IS NULL
			
		}else if(value < root.value){//IF THE VALUE < THE CURRENT NODE
			root.left = removeHelper(root.left, value);//REMOVE THE LEFT
		}else if(value > root.value) {//IF THE VALUE > THE CURRENT NODE
			root.right = removeHelper(root.right, value);//REMOVE THE RIGHT
		}else {//THE NODE IS FOUND
			
			//IF THE NODE HAS CHILDREN , ITS A BIT COMPLICATED 
			//SO WHEN REMOVING THE ROOT THAT HAS CHILDREN, THEN NODES HAVE TO BE SHIFTED
			
			//NOW CHECK IF THE CHILD IS A LEAF
			//IF THE RIGHT AND LEFT ARE LEAF
			if(root.left == null && root.right == null) {
				root = null; //IF THEY ARE LEAFS , RETURN NULL, NO SHIFTING
				
			}else if (root.right != null) {//IF THE RIGHT CHILD IS NOT A LEAF , FIND A SUCCESOR FOR THE NODE
				root.value = successor(root); // FIND A SUCCERSOR FO THE REMOVED NODE
				root.right = removeHelper(root.right, root.value);//LINK THE CHILD TO THE POSITION OF THE DELETED NODE
				
			}else {//IF THE LEFT CHILD IS NOT A LEAF , FIND A PREDECESSOR FOR THE NODE
				root.value = predecessor(root); // FIND A SUCCERSOR FO THE REMOVED NODE
				root.left = removeHelper(root.left, root.value);//LINK THE CHILD TO THE POSITION OF THE DELETED NODE
				
			}
		}
		return root; //RETURN THE ROOT
	}
	//THE REMOVE METHOD DEPENDS O THE SUCCESSER AND PREDECESSER 
	//SUCCESSOR : FIND THE LEAST VALUE BELOW  THE RIGHT CHILD OF THIS ROOT NODE
	private int successor(Node root) {
		root = root.right;//CURRENT ROOT WILL EQUAL THE RIGHT CHILD
		
		//CHECK TO SEE IF THE LEFT ROOT IS NO NULL
		while(root.left != null) {//WHILE THIS IS TRUE:
			root = root.left; // SET THE ROOT  TO THE LEFT CHILD
		}
		return root.value;
	}
	//PREDECESSOR: FIND THE GREATEST VALUE BELOW  THE RIGHT CHILD OF THIS ROOT NODE
	private int predecessor(Node root) {
		root = root.left;//CURRENT ROOT WILL EQUAL THE LEFT CHILD
		
		//CHECK TO SEE IF THE LEFT ROOT IS NO NULL
		while(root.right != null) {//WHILE THIS IS TRUE:
			root = root.right; // SET THE ROOT  TO THE RIGHT CHILD
		}
		return root.value;
	}

}
