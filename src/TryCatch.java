
public class TryCatch {

	public static void main(String[] args) {

		try {

			int a = 0;
			int b = 20 / a;
			System.out.println("This will not be printed"); // wont be executed as caught exception before it
		}

		catch (ArithmeticException e) {
			System.out.println("Division by zero" + e);
			// TODO: handle exception
		}

		System.out.println("Out of try-catch block");

	}

}
