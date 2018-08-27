package exeptions.Throws;

public class Example4 {

	public static void main(String[] args) {
		try {
			getOne();
		} catch (Exception e) {
			System.out.println("Correct error in main method");
		} 
		System.out.println("Continious code in main method");
	}
	
	public static void getOne() throws ArithmeticException {
		System.out.println("Im the first");
		getTwo();
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
