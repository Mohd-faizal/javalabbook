package labbook;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Integer Number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		input.close();
		if(num%2==0)
			System.out.println("Entered number is Even");
		else
			System.out.println("Entered number is Odd");
		
		
	}

}
