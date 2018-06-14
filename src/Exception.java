
public class Exception {

	static void error() {
		int a = 0;
		int b = 40 / a;

		System.out.println("Result of division is : " + b);

	}

	public static void main(String[] args) {

		Exception.error();
	}
}
