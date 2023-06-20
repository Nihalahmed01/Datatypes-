public class ArrayClass{
	public static void main(String[] args){
		
		//using literals..
	int[] marksScored = {98,88,75,56,40,96};
	int[] runsScoredByPlayers = {45,112,56,89,1,23};
	int[] candidatesParticipated = {45,78,85,65,77,12};
	int[] salaryForTheemployees = {500,450,789,899,520,100};
	char[] divisionsOfclass = {'a','b','c','d','e','f'};
	char[] vowels = {'a','e','i','o','u'};
	float[] percentage ={98.23f,35.25f,89.87f,75.52f,88.26f,66.87f};
	float[] strikeRateOfBatsman = {142.2f,155.23f,189.23f,200.0f,240.54f,100.98f};
	byte[] temperature = {100,25,42,20,56,12};
	float[] weightInGrams = {12.5f,50.26f,45.0f,78.59f,65.23f,78.23f};
	System.out.println(marksScored[2]);
	System.out.println(marksScored[4]);
	System.out.println(runsScoredByPlayers[2]);
	System.out.println(runsScoredByPlayers[2]);
	System.out.println(candidatesParticipated[0]);
	System.out.println(candidatesParticipated[2]);
	System.out.println(salaryForTheemployees[3]);
	System.out.println(salaryForTheemployees[1]);
	System.out.println(divisionsOfclass[5]);
	System.out.println(vowels[4]);
	System.out.println(vowels[2]);
	System.out.println(percentage[4]);
	System.out.println(percentage[2]);
	System.out.println(strikeRateOfBatsman[2]);
	System.out.println(strikeRateOfBatsman[3]);
	System.out.println(temperature[0]);
	System.out.println(temperature[1]);
	System.out.println(weightInGrams[2]);
	System.out.println(weightInGrams[4]);
	
	
	//using new keywords..
	float[] weights = new float[6];
	weights[0] = 53.2f;
	weights[1] = 60.23f;
	weights[2] = 35.23f;
	
	float height = new float[6];
	height[0] = 165.23f;
	height[3] = 213.258f;
	height[5] = 198.123;
	
	float rateOfInterest = new float[6];
	rateOfInterest[0] = 18.25f;
	rateOfInterest[3] = 12.85f;
	rateOfInterest[5] = 10.25f;
	
	int numberOfInsitutue = new int[6];
	numberOfInsitutue[0] = 21;
	numberOfInsitutue[3] = 30;
	
	int rollNumber = new int[6];
	rollNumber[0] = 5;
	rollNumber[2] = 14;
	rollNumber[4] = 20;
	
	char grade = new char[6];
	grade[0] = 'A';
	grade[3] = 'B';
	grade[5] = 'C';
	
	char rainbowColours = new char[6];
	rainbowColours[1] = 'B';
	rainbowColours[3] = 'Y';
	
	byte numberOfSubjects = new byte[6];
	numberOfSubjects[0] = 6;
	numberOfSubjects[5] = 12;
	
	char trafficSymbols = new char[6];
	trafficSymbols[2] = 'P';
	trafficSymbols[4] = 'R';
	
	//changing
	runsScoredByPlayers[1] = 89;
	vowels[3] = 'Y';
	numberOfSubjects[5] = 15;
	grade[5] = 'F';
	weightInGrams[4] = 145.23f;
	
	//applying loop
	for(int i=0; i<runsScoredByPlayers.length; i++){
		System.out.println(runsScoredByPlayers[1]);
	}
	for(char i=0; i<vowels.length; i++){
		System.out.println(vowels[3]);
	}
	for(byte i=0; i<numberOfSubjects.length; i++){
		system.out.println(numberOfSubjects[5]);
	}
	for(char i=0; i<grade.length; i++){
		System.out.println(grade[5]);
	}
	for(float i=0; i<weightInGrams.length; i++){
		System.out.println(weightInGrams[4]);
	}
	
	
	}
}