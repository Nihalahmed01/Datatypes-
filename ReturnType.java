public class ReturnType{
	public static void main(String[] args){
		
		char returnValue = vowels();
		System.out.println(returnValue);
		
		int addedValue = add();
		System.out.println(addedValue);
		
		float dividedValue = divide();
		System.out.println(dividedValue);
		
		boolean returnedValue = checkTheNumber();
		System.out.println(returnedValue);
		
		String greeting = getGreetings();
		System.out.println(greeting);
		
		long returnAccNo = accNo();
		System.out.println(returnAccNo);
		
		short returnedPinNo = pinNo();
		System.out.println(returnedPinNo);
		
		double returnedPiValue  = valueOfPi();
		System.out.println(returnedPiValue);
		
		byte returnValueOfNumbers = sumOfTwoNumbers();
		System.out.println(returnValueOfNumbers);
		
		
		
		
	}
	
	
	public static char vowels(){
		System.out.println("methd started");
		return 'a';
	}
	
	public static int add(){
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public static float divide(){
		float a = 6.25f;
		float b = 78.255f;
		float c = a/b;
		return c;
	}
	
	public static boolean checkTheNumber(){
		int num = 45;
		if(num>=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static String getGreetings(){
		return "Hello, Good Moring";
	}
	
	
	public static long accNo(){
		long a = 4578956412l;
		return a;
	}
	
	public static short pinNo(){
		short a = 1452;
		return a;
	}
	
	public static double valueOfPi(){
		double pi = 1.4521687999;
		return pi;
	}
	
	public static byte sumOfTwoNumbers(){
		byte a = 45 + 45;
		
		return a;
	}
	
	
	
	
	}
