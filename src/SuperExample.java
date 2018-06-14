
public class SuperExample {

	public static void main(String[] args) {

		B subOb = new B(1, 2);
		subOb.show();

	}
}

class A {

	int i;

}

class B extends A {

	int i;

	B(int a, int b) {   //inheritance allows reuse of code
		
		super.i = a;
		i = b;

	}

	void show() {
		System.out.println("i in superclass A is : " + super.i);
		System.out.println("i in superclass B is : " + i);
	}
}
