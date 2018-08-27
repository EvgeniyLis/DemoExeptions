package exeptions.simple;

public class Example1 {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			System.err.println("Dividing by zero");
		}
		
		System.out.println("Continious code");

	}

}
