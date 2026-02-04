import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		//MAPS => SET OF KEY-VALUE PAIRS
		//IT MAPS KEYS TO VALUES
		//FOR EG:HAVING EMPLOYEES WITH ID NUMBERS, 
		//NOW U WANT THEIR ID'S BY JUST TYPING IN THEIR NAME
		
		//IMPLEMENTING A MAP WITH A HASHMAP
		//CANNOT USE MAP<> BECAUSE IT IS AN INTERFACE
		//NOW WE IMPLEMENT IT BY A HASHMAP
		
		//EMPLOYEE INFO: KEY = NAME , VALUE = ID NO 
		HashMap<String , Integer> employeeInfo = new HashMap<>();
		
		//ADDING EMPLOYEES TO THE MAP WITH THEIR NAMES AND IDS : put()
		employeeInfo.put("KEA" , 12345);
		employeeInfo.put("KAM" , 54321);
		employeeInfo.put("GIZ" , 67890);
		employeeInfo.put("MOSI" , 49876);
		
		//PRINTING OUT THE MAP
		System.out.println("ORIGINAL MAP: " + employeeInfo);
		
		//GETTING THE KEY'S VALUE
		System.out.println("GETTING KEA'S ID: " + employeeInfo.get("KEA"));
		
		//CHECKING IF THE KEY EXIST
		System.out.println("KEA IS EXIST IN THE MAP: " + employeeInfo.containsKey("KEA"));
		
		//CHECKING IF THE VALUE EXIST
		System.out.println("KEA'S ID EXIST IN THE MAP: " + employeeInfo.containsValue(12345));
		
		//REPLACING THE VALUE OF THE KEY
		employeeInfo.replace("KEA", 777);//REPLACE KEA'S ID
		System.out.println("NEW MAP: " + employeeInfo); //{KEA=777, KAM=54321, GIZ=67890, MOSI=49876}
		//REPLACING THE KEY'S VALUE, BUT THE KEY DOES NOT EXIST
		employeeInfo.replace("MOSA", 777);
		System.out.println("REPLACE KEY'S VALUE THAT IS NO IN THE MAP(SAME): " + employeeInfo);
		
		//ADDING THE KEY THAT IS ABSENT IN THE MAP
		employeeInfo.putIfAbsent("KEA", 777);//ALREADY THERE, IT WONT BE ADDED
		System.out.println("ADD KEA IF HE IS ABSENT(SAME): " + employeeInfo);
		employeeInfo.putIfAbsent("GENZU", 777);
		System.out.println("ADD GENZU IF HE IS ABSENT(ADDED THEREFORE MAP CHANGED): " + employeeInfo);
	}

}
