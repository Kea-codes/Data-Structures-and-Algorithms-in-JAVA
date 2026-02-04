
public class Main {

	public static void main(String[] args) {
		
		//Arrays are used to store multiple objects in one variable
		
		String[] cars = {"Ferrari" , "BENZ", "BMW", "Corvett"};
		
		//accessing the first element
		System.out.println(cars[0]);
		//accessing the second element
		System.out.println(cars[1]);
		//accessing the third element
		System.out.println(cars[2]);
		
		
		
		//initializing the size of the array and the array itself
		int[] values = new int[5];
		 
		values[0]= 10;
		values[1]= 20;
		values[2]= 30;
		values[3]= 40;
		values[4]= 50;
		
		//the For loop iterates thru the array 
		for(int counter=0; counter < values.length; counter++) {
			
			System.out.print(values[counter]);
						
		}
		
	
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		// geting the size of the array
		System.out.println("Array size: " + cars.length);
		
		// ADD & REMOVE ELEM :CANNOT REMOVE OR ADD ELEM IN THE ARRAY BECOS FIXED ARRAY

		// SET ELEM
		cars[0] = "VW";
		System.out.println("SET ELEM AT INDEX 0: " + cars[0]);

		// PRINT OUT ARRAY
		System.out.println("Printed array: " + cars);
		//Printed array: [Ljava.lang.String;@5b2133b1
		//therfore need a forloop to print a proper array
		
		for(int i=0; i< cars.length; i++) {
			System.out.println("PRINTED ARRAY: " + cars[i]);
		}

	}

}
