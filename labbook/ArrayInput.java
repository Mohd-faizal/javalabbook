package labbook;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[]array=new int[10];
		int sum=0;
		System.out.println("Enter the Elements:");
		for(int i=1;i<=3;i++)
		{
			array[i]=scanner.nextInt();
		}
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);
		scanner.close();
	}

}
