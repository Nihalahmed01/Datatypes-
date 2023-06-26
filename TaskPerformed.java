public class TaskPerformed{
	public static void main(String[] args){
		
	boolean returnedName = checkName("Ahmedd");
	System.out.println(returnedName);
	String returnEvenOrOdd = EvenNumber(6);
	System.out.println(returnEvenOrOdd);
	String returnednumber = checkPrime(7);
	System.out.println(returnednumber);
	String returnedCharacter = checkGender("Male");
	System.out.println(returnedCharacter);
	String returnedResults = passOrFailed(50);
	System.out.println("returnedResults");
	String returnedValue  = checkPositiveOrNegative(-5);
	System.out.println(returnedValue);
	String returnedGreatesh = greatestNumber(45 , 55);
	System.out.println(returnedGreatesh);
	int returnSum = calculateSum(4 , 8);
	System.out.println(returnSum);
	
		
		
	}
	
	
	public static boolean checkName(String name){
		if(name.length() >=5){
			System.out.println("valid");
			return true;
		}
		else{
			System.out.println("not valid");
			return false;
		}
	}
	public static String EvenNumber(int num){
		if(num%2 ==0)
		{
			System.out.println("num is even");
			return "even";
		}
		else
		{
			System.out.println("num is odd");
			return "odd";
		}
		
	}
	public static String checkPrime (int number){
		if(number%2==0){
			System.out.println("Prime");
			return "prime";
		}
		else{
			System.out.println("not a prime number");
			return "not prime";
		}
	}
	public static String checkGender(String gender){
		if(gender == "Male"){
			System.out.println("Male");
			return "M";
		}
		else{
			System.out.println("Female");
			return "F";
		}
	}
	public static String passOrFailed(int marks){
		if(marks<=35){
			System.out.println("pass");
			return "P";
		}
		else{
			System.out.println("fail");
			return "F";
		}
	}
	public static String checkPositiveOrNegative(int digit){
		if(digit>0){
			System.out.println("positvie");
			return "Positive";
		}
		else{
			System.out.println("negative");
			return "Negavtive";
		}
	}
	public static String greatestNumber(int a, int b){
		if(a > b){
			System.out.println("Greater");
			return "A is greater";
		}
		else{
			System.out.println("B is greater");
			return "B is greater";
		}
		
	}
	public static int calculateSum(int a, int b){
		int c = a + b;
		return c;

	}
	
 
	
	
}