package day10.misc;

public class Divide {

	public static int divideNumbers(int a, int b) throws Exception {

		int num1 = a;
		int num2 = b;

		if (num2 == 0) {

			throw new Exception("Divisor cannot be zero");
		}

		return a / b;

	}

	public static void main(String[] args) {

		try {
			System.out.println(Divide.divideNumbers(5, 0));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {

			System.out.println("Exception Handled");
		}
	}
}
