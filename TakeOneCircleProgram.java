import java.util.Scanner;

public class TakeOneCircleProgram {

	public static void main(String[] args) {
		// Program that provides the circumference and area of a circle after a user provides the radius 
    
	

	Circle circle = new Circle ();	
	double radius = 0;	
	System.out.println("Welcome to the Circle Tester");
    Scanner scan1 = new Scanner (System.in);
    System.out.println("Please enter a radius: ");
    radius = scan1.nextDouble();
    circle.getCircumferance(radius);
    circle.getArea(radius);
    
    
		
	}

}
