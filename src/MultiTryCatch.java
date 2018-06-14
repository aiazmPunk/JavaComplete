
public class MultiTryCatch {

	public static void main(String[] args) {

		try {

			int a = 0;
			int b = 40 / a;

			int vals[] = { 1, 2, 3 };

			vals[5] = 3;
		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // This catch clause has ability to catch both
																			// exceptions.
			System.out.println("Exception caught : " + e);
		}
	}
}
