package labbook;

public class Largestnumber {
	public static void main(String[] args) {
		double n1=-5.5,n2=3.5,n3=4.5;
		if(n1>=n2 && n1>=n3)
			System.out.println(n1 +"is the Largest number");
		else if(n2>=n1 && n2>n3)
			System.out.println(n2 +"is the Largest number");
		else
			System.out.println(n3 +"is the Largets number");
	}

}
