package labbook;

import java.util.Scanner;
public class AreaofCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double radius=scanner.nextDouble();
		scanner.close();
		double area=Math.PI * (radius * radius);
		System.out.println("The area of circle is:"+area);
		double circumference=Math.PI*2*radius;
		System.out.println("The circumference of Circle is:"+circumference);
	}

}
