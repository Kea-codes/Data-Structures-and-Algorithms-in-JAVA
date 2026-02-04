import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//STACKS
		//THEY STORE ARBITRARY OBJECTS OR ELEMENTS
		//THEY CAN RUN OUT OF SPACE IF MANY OBJECTS ARE ADDED USING A LOOP
		//USES A LIFO SCHEME
		
		//DECLARING AND INSTANTIATING A STACK OF MOVIES
		Stack<String> movieStack = new Stack<>();
		
		//INSERTING THE OBJECT/ELEMENT
		movieStack.push("Minecraft");
		movieStack.push("Skyrim");
		movieStack.push("Doom");
		movieStack.push("Borderlands");
		movieStack.push("FFVII");
		
		//CHECKING IF THE STACK IS EMPTY
		System.out.println("IS STACK EMPTY: " + movieStack.empty());
		
		//PRINTING THE STACK
		//[Minecraft, Skyrim, Doom, Borderlands, FFVII]
		System.out.println("PRINTING THE STACK: " + movieStack);
		
		//REMOVE THE ELEMENT
		movieStack.pop();
		//[Minecraft, Skyrim, Doom, Borderlands]
		System.out.println("REMOVED ELEM FROM STACK: " + movieStack);
		//Initializing an elem that will be removed 
		String removedElem = movieStack.pop();
		System.out.println("ANOTHER REMOVED ELEM: " + removedElem);//Borderlands
		
		//LOOKING INTO THE STACK FROM THE TOP
		System.out.println("TOP ELEM IN THE STACK: " + movieStack.peek());
		
		//REMAIINING STACK
		System.out.println("REMAINING STACK: " + movieStack);
		
		//SERACHING FOR AN ELEM IN THE STACK
		//Minecraft is the 3rd one in the stack
		System.out.println("SEARCHNG FOR MINECRAFT: " + movieStack.search("Minecraft")); // 3
		
	}

}
