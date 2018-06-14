import java.util.Random;

public class TryCatchExample2 {

	public static void main(String[] args) {

		int a, b, c;

		Random r = new Random();

		for (int i = 0; i < 30000; i++) {

			try {

				b = r.nextInt();
				c = r.nextInt();

				a = 12345 / (b / c);

			}

			catch (ArithmeticException e) {
				System.out.println("Division by zero ");

				a = 0;

			}

		}

		System.out.println("out of catch block ");

	}

}
