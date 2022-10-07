package labbook;

import java.util.Scanner;

public class AreaofSquare {
	public static void main(String[] args) {
		System.out.println("Enter side of Square:");
		Scanner scanner=new Scanner(System.in);
		double side=scanner.nextDouble();
		scanner.close();
		double area=side*side;
		System.out.println("Area of Square is:"+area);
	}

}
