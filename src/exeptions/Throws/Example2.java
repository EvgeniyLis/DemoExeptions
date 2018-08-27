package exeptions.Throws;

public class Example2 {

	public static void main(String[] args) {
		getOne();
	}
	
	public static void getOne() {
		System.out.println("Im the first");
		getTwo();
		System.out.println("Continious code first");
	}
	public static void getTwo() {
		System.out.println("Im the second");
		try {
			getThree();
		} catch (Exception e) {
			System.out.println("Correct error in two method");
		}
		System.out.println("Continious code second");
	}
	public static void getThree() throws ArithmeticException {
		System.out.println("Im the third");
		throw new ArithmeticException();
	}
}
