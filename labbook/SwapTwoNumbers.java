package labbook;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first=3.5f,second=5.5f;
		System.out.println("--Beforeswap--");
		System.out.println("Firstnum=" +first);
		System.out.println("Secondnum=" +second);
		float temporary=first;
		first=second;
		second=temporary;
		System.out.println("--Afterswap--");
		System.out.println("firstnum=" +first);
		System.out.println("secondnum=" +second);

		

	}

}
