package exeptions.Throws;

public class Example3 {

	public static void main(String[] args) {
		getOne();
	}
	
	public static void getOne() {
		System.out.println("Im the first");
		try {
			getTwo();
		} catch (Exception e) {
			System.out.println("Correct error in first method");
		}
		System.out.println("Continious code first");
	}
	public static void getTwo() throws ArithmeticException {
		System.out.println("Im the second");
		getThree();
		System.out.println("Continious code second");
	}
	public static void getThree() throws ArithmeticException {
		System.out.println("Im the third");
		throw new ArithmeticException();
	}
}
