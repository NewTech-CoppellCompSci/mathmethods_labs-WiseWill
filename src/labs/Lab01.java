package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		//asking for two numbers and storing them as varibles
		System.out.print("Enter a positive integer:");
		int num1 = inKey.nextInt();
		System.out.println("Enter another positive integer:");
		int num2 = inKey.nextInt();
		//putting the first number to the next power.
		System.out.println(num1+"^"+num2+" = " + Math.pow(num1,num2));
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		//asking for number
		System.out.println("\nEnter a positive integer:");
		int num1 = inKey.nextInt();
		//doing calculation
		double num2 = Math.sqrt(num1);
		//pinting statment
		System.out.println("The square root of "+ num1+" is " +num2);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		//asking for sides and storing
		System.out.println("\nLength of side A:");
		double num1 = inKey.nextDouble();
		System.out.println("Length of side B:");
		double num2 = inKey.nextDouble();
		//A^2+B^2=C^2
		double halfway = Math.pow(num1,2) + Math.pow(num2,2);
		double root = Math.sqrt(halfway);
		System.out.println("Hypotenuse = "+root);
		
		
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		int storedNum = 938765;
		System.out.print("\n");
	//seting max and min to extreams.
	int min = 999999999;
	int max = -999999999;
	//seting up loop to reapet untill 0
	while (storedNum != 0) {
		System.out.println("Enter an integer:");
		int num = inKey.nextInt();
		if (num > max) {
			max = num;
		}
		if (num < min) {
			min = num;
			
		}
		storedNum = num;
		
	}
	//printing results
	System.out.println("Max = "+max);
	System.out.println("Min = "+min);
		
	}
	
	
	
	
	
	
}
