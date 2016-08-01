import java.text.DecimalFormat;

public class Circle {

	public static void main(String[] args) {
		// Circle constructors and methods
		
		
		double radius = 0;
		
		getCircumferance(radius); 
		
		getArea(radius);
		
		
		

	}

	public static void getArea(double radius) {
		double area = (Math.PI * radius * radius);
		DecimalFormat df = new DecimalFormat ();
		df.setMaximumFractionDigits(2);
		System.out.println("The area of the circle is: " + df.format(area));
	}

	public static void getCircumferance(double radius) {
		double circ = (2 * Math.PI * radius);
		DecimalFormat df = new DecimalFormat ();
		df.setMaximumFractionDigits(2);
		System.out.println("The circumferance of the circle is: " + df.format(circ));
	}
	
	
	
	//DecimalFormat df = new DecimalFormat();
//	df.setMinimumFractionDigits(3);
	//System.out.println("Batting Average: " + df.format (battingAveragePieceOne/userInput));

	//public void getCircumferance() {
		// TODO Auto-generated method stub
		
	//}

}
