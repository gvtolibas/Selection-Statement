import java.util.Scanner;
public class Selection {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println();
		System.out.println("    [ Activity 2 - Selection ]"); //Submitted by Tolibas, Gerome V.
		System.out.println();
		
		//Area Menu
		System.out.println("    Choose a shape to calculate its area:");
		System.out.println("    C = Circle");
		System.out.println("    R = Rectangle");
		System.out.println("    S = Square");
		System.out.println("    T = Triangle");

		System.out.println();
		System.out.print("    Enter your choice: ");
		
		String choice = sc.nextLine().toUpperCase();
		
		switch (choice) {
		    case "C" :
		        System.out.println();
		        System.out.println("    [ Circle ]");
		        System.out.print("    Enter the radius of the circle: ");
		        double radius = sc.nextDouble();
		        double pi = 3.14;
		        
		        double areaCircle = pi * radius * radius;
		        System.out.println("    The area of the circle is " + areaCircle);
		        break;
		        
		    case "R" :
		        System.out.println();
		        System.out.println("    [ Rectangle ]");
		        System.out.print("    Enter the length of the rectangle: ");
		        double length = sc.nextDouble();
		        System.out.print("    Enter the width of the rectangle: ");
		        double width = sc.nextDouble();
		        
		        double areaRectangle = length * width;
		        System.out.println("    The area of the rectangle is " + areaRectangle);
		        break;
		        
		    case "S" :
		        System.out.println();
		        System.out.println("    [ Square ]");
		        System.out.print("    Enter the side length of the square: ");
		        double side = sc.nextDouble();
		        
		        double areaSquare = side * side;
		        System.out.println("    The area of the square is " + areaSquare);
		        break;
		        
		    case "T" :
		        System.out.println();
		        System.out.println("    [ Triangle ]");
		        System.out.print("    Enter the base of the triangle: ");
		        double base = sc.nextDouble();
		        System.out.print("    Enter the height of the triangle: ");
		        double height = sc.nextDouble();
		        
		        double areaTriangle = 0.5 * base * height;
		        System.out.println("    The area of the triangle is " + areaTriangle);
		        break;
		        
		    default:
		        System.out.println();
		        System.out.println("    INVALID CHOICE!");
		}
	}
}
