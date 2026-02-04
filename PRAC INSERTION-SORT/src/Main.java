import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// INSERTION SORT
		// THE INSERTION SORT START AT INDEX 1
		// TAKES THE VALUE FROM THE ARRAY, STORES IN IN THE TEMP
		// COMPARES THE CURRENT VALUE WITH THE BEFORE VALUE
		// IF BEFORE VALUE > AFTER VALUE , SWAP THE BEFORE VALUE AND AFTER VALLUE
		// TO MAINTAIN ASCENDING ORDER
		
		//CREATE AN ARRAY FOR DEMOSTRATION
		int[] array = {9,1,8,2,7,3,6,5,0};
		
		//DISPLAYING THE ARRAY
		System.out.print("DISPLAY ARRAY: " );
		for (int i=0; i < array.length ; i++) {
			System.out.print(array[i] + "  ");
			
		}
		
		System.out.println();
		
		//DISPLAYONG THE SORTED ARRAY
		System.out.print("SORTED ARRAY: "  );
		insertionSort(array);
		for (int i=0; i < array.length ; i++) {
			System.out.print(array[i] + "  ");
			
		}
		
		
	}//OUTSIDE OF THE MAIN
	
	
	//THE INERTION SORT METHOD
	public static void insertionSort(int[] array) {
		
		//ITERATE THROUGH THE ARRAY STARTING FROM INDEX 1
		for(int i=1; i < array.length; i++) {
			//CREATE A TEMPORARY VARIABLE 
			int temp = array[i];
			int j = i-1;//THE BEFORE VALUE
			
			//CONTINUE CAMPARING VALUES
			// BEFORE VALUE STARTS FROM THE INDEX 0
			while (j>=0 && array[j] > temp) {
				//SHIFT AN ELEMT TO THE RIGHT
				array[j+1] = array[j];
				j--; //DECREMENT THE BEFORE 
				
			}
			//INSERT THE BEFORE VALUE TO THE OPENING
			array[j+1] = temp;
		}
		
		
		
	}
}
