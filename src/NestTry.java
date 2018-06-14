
class NestTry1 {

	static int a = 2;

	static int b = 3;

	static void test() {

		System.out.println("a and b are : " + a + " " + b);

	}
}

public class NestTry {
	public static void main(String[] args) {

		NestTry1.test();

		System.out.println("a is  : " + NestTry1.a);
	}
}
