package exeptions.Finally;

public class Example1 {

	public static void main(String[] args) {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.out.println("Arithmetic error");
		} finally {
			System.out.println("Im finally block");
		}

	}

}
