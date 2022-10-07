package labbook;

import java.util.Scanner;
public class AreaofTriangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Length of Triangle:");
		double length=scanner.nextDouble();
		System.out.println("Enter the Width of Triangle:");
		double width=scanner.nextDouble();
		scanner.close();
		double area=length*width;
		System.out.println("Area of Triangle is:"+area);
	}

}
