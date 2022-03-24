package labs;
import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		//asking for data
		
		Scanner inKey = new Scanner(System.in);
		
		
		//ask for launch angle and velocity
		//declare, time, 
		
		double time = 0;
		double xPosition = 0;
		double yPosition = 5;
		System.out.println("Enter launch velocity (m/s) >>>");
		double launchVelocity = inKey.nextDouble();
		System.out.println("Enter launch angle (degrees) >>>");
		double launchAngle = inKey.nextDouble();
		System.out.print("Projectiles path.");
		//creating loop
		while (yPosition>=0) {
			System.out.println("\nTime: "+time);
			
			xPosition = Math.cos(Math.toRadians(launchAngle))*time*launchVelocity;
			//yPosition = sine of launch angle * time * lanuchVelocity – 0.5 * 9.8 * time2
			yPosition = Math.sin(Math.toRadians(launchAngle))*time*launchVelocity -.5*9.8*Math.pow(time, 2);
			
			System.out.println("x-pos: "+xPosition+"m");
			
			if (yPosition>0) {
			System.out.println("y-pos: "+yPosition+"m");
			}
			else {
				System.out.println("y-pos: 0m");
			}
			time++;
			
			
			
			
			
			
		}
		
		
		
	}
	
	
}
