import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//MERGING ARRAYS
		// => CREATING 2 OR MORE ARRAYS AND COMBINE THEM INTO ONE
		// =>IT DOES NOT MATTER IF ITS INTEGER ARRAYS OR STRING OR CHARACTERS
		
		int[] array1 = {8,1,5,3,10}; //THE FIRST ARRAY
		int[] array2 = {2,6,7,9,11}; //THE SECOND ARRAY
		
		//INITIALIZE THE ARRAY THAT THE ABOVE ARRAYS WILL BE MERGED INTO
		//THE SIZE OF THE ARRY = SIZE OF ARRA1 + SIZE OF ARRAY2
		int[] arrayMerg = new int[array1.length + array2.length];
		
		//LOAD IN THE ARRAY1 INTO
		for(int i=0;i< array1.length; i++) {//INTERATE THROUGH THE ARRAY1 AND ADD THEN IN THE ARRAYMERGE
			arrayMerg[i] =array1[i];//ADDING THE ARRAY IN THE MERGE ARRAY
		}
		
		//ADD IN THE ARRAY2 INTO ARRAYMARGE
		for (int i=0; i < array2.length; i++) {//ITERATE THRU THE ARRAY2 IN ARRAYMERG
			arrayMerg[i + array1.length] = array2[i];
			
		}
		
		
		//PRINT OUT THE ARRAYMERGE
		System.out.print("MERGED ARRAY: ");
		for(int i=0; i < arrayMerg.length; i++) {
			
			System.out.print(arrayMerg[i] + " ");
		}
		System.out.println();
		System.out.print("SORTED MERGED ARRAY: ");
		//SORTING OUT THE ARRAY
		Arrays.sort(arrayMerg);
		for(int i=0; i < arrayMerg.length; i++) {
			
			System.out.print(arrayMerg[i] + " ");
		}
		
		

	}

}
