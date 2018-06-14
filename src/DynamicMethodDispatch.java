
public class DynamicMethodDispatch {

	public static void main(String[] args) {

		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();

		A1 r = a;

		r.callme();

		r = b;
		r.callme();

		r = c;
		r.callme();

	}

}

class A1 {

	void callme() {
		System.out.println("call inside A1");
	}
}

class B1 extends A1 {

	void callme() {

		System.out.println("call inside B1");
	}

}

class C1 extends B1 {

	void callme() {
		System.out.println("call inside C1");
	}
}