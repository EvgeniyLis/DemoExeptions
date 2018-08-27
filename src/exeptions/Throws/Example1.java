package exeptions.Throws;

public class Example1 {

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
		getThree();
		System.out.println("Continious code second");
	}
	public static void getThree() {
		System.out.println("Im the third");
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("Обработка иключения");
		}
		System.out.println("Continious code third");
	}
}
