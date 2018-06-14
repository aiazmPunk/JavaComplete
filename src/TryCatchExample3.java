
public class TryCatchExample3 {

	public static void main(String[] args) {

		int a = args.length;
		try {

			int b = 42 / a;

			System.out.println("a = " + a);

			try {

				if (a == 1)
					a = a / (a - a);

				if (a == 2) {
					int c[] = { 1 };
					c[69] = 3;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of bounds : " + e);
			}

		}

		catch (ArithmeticException e) {
			System.out.println("Divide by 0 : " + e);
		}

	}
}
