import java.util.*;

public class SlopeV2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the x-coordinate of the first point:");
		double x1 = s.nextDouble();
		System.out.print("Enter the y-coordinate of the first point:");
		double y1 = s.nextDouble();
		System.out.print("Enter the x-coordinate of the second point:");
		double x2 = s.nextDouble();
		System.out.print("Enter the y-coordinate of the second point:");
		double y2 = s.nextDouble();
		System.out.println("The slope of ("+x1+" , "+y1+") and ("+x2+" , "+y2+") is: "+getSlope(x1, y1, x2, y2));
	}
	public static String getSlope(double x1, double y1, double x2, double y2){
		if (x1 == x2){
			return "Undefined";
		} else {
			return String.valueOf((y2-y1)/(x2-x1));
		}
	}

}
