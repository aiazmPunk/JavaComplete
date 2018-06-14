
public class StaticByName {
	public static void main(String[] args) {

		StaticDemo.callMe();

		System.out.println("b = " + StaticDemo.b);
	}
}

class StaticDemo {

	static int a = 42;
	static int b = 50;

	static void callMe() {
		System.out.println("a = " + a);
	}

}
