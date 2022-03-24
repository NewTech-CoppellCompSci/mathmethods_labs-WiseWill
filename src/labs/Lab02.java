package labs;
import java.util.Scanner;


public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		//asking for 2 nums
		System.out.print("Enter a positive integer:");
		int num1 = inKey.nextInt();
		System.out.println("Enter another positive integer:");
		int num2 = inKey.nextInt();
		//finding max and min
		int max = Math.max(num1, num2);
		int min = Math.min(num1,num2);
	
	//setting up loop
	for (int i = 0; i<10; i++) {
		int randNum = (int)(Math.random()*(max-min)+min);
		System.out.print(randNum+" ");
	}
	
		
		
		
	}
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		//asking for stuff
		System.out.println("\nWhat is the Radius of the Clyinder");
		double rad = inKey.nextDouble();
		System.out.println("what is the Hight of the Clyinder");
		double hight = inKey.nextDouble();
		//doing formula
		double V = Math.PI * Math.pow(rad,2)*hight;
		System.out.println("The volume of the clyinder is "+V);
		
		
		
	}

	
	

	public static void problem03() {
		//Asking stuff.
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\nEnter X1");
		double x1 = inKey.nextDouble();
		
		System.out.println("\nEnter Y1");
		double y1 = inKey.nextDouble();
		
		System.out.println("\nEnter X2");
		double x2 = inKey.nextDouble();
		
		System.out.println("\nEnter Y2");
		double y2 = inKey.nextDouble();
		
		//distance formula!
		
		double Distance = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		
		//print results
		System.out.println("Distance beetween points = "+Distance);
		
		
	}


	
	
	public static void problem04() {
		//asky for vaules
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\nEnter a-value:");
		double a = inKey.nextDouble();
		System.out.println("Enter b-value:");
		double b = inKey.nextDouble();
		System.out.println("Enter c-value:");
		double c = inKey.nextDouble();
		//doing x 1
		double x1 =(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		double x2 =(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		
		System.out.println("x1="+x1);
		System.out.println("x2="+x2);
	}
	
	

	
}
