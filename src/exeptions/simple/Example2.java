package exeptions.simple;

public class Example2 {

	public static void main(String[] args) {
		int[] numbers = {2, 0, -4, 5, 6};
		try {
			System.out.println(numbers[5]);
			System.out.println(numbers[0]/numbers[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Out of bounds");
		} catch (ArithmeticException e) {
			System.err.println("Dividing by zero");
		}
		System.out.println("Continious code");
	}

}
