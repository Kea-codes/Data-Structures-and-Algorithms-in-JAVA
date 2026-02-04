

public class Main {

	public static void main(String[] args) {
		
		//INSERTION SOR
		//ALGO THAT SORTS THE ARRAY BY SWAPING THE ELEMENTS 
		//IF BEFORE ELEM > AFTER : THEN SWAP
		//BEGINS SORTING FROM INDEX 1
		
		//CRAETE AN INTEGER ARRAY
		
		int arry[] = {6,1,7,2,9,8,5,3};
		
		System.out.print("ORIGINAL ARRAY: ");
		//DISPLAY THE ORIGINAL ARRAY
		for(int i=0; i < arry.length ; i++) {
			System.out.print( arry[i] + "  ");
		}
		
		
		System.out.println();
		
		//CALLING AN INSERTION 
		insertionSort(arry);
		System.out.print("SORTED ARRAY: ");
		for(int i=0; i < arry.length ; i++) {
			System.out.print( arry[i] + "  ");
		}
		
	}//OUTSIDE THE MAIN
	
	//IMPLEMENTING A INSERT SORTING METHOD
	//TAKES IN AN INTEGER ARRAY
	public static void insertionSort(int[] array) {
		//ITERATE THROUGH THE ELEMENTS OF THE ARRAY
		for (int i=0; i < array.length ; i++) {
			//CRAETE A TEMPORARY PLACE HOLDER FOR THE VALUES IN THE ARRAY
			int temp = array[i];
			//NUMBER THAT COMES BEFORE I
			int j= i-1;
			
			//CONTINUE COMPARING VALUES TO THE LEFT OF I
			while (j >= 0 && array[j] > temp) {
				//SHIFT THE ELEMENTS TO THE RIGHT AFTER COMPARING
				array[j+1] = array[j];
				j--;
			}
			//INSERT VALUES ON THE OPENING
			array[j+1] = temp;
			
		}
		
		
	}

}
