
public class ObjectArguments {

	public static void main(String[] args) {

		Test1 ob = new Test1(15, 20);

		System.out.println("a and b values before method call  :" + ob.a + " " + ob.b);

		// Calling method meth

		ob.meth(ob);

		System.out.println("a and b values after method call : " + ob.a + " " + ob.b);

	}
}

class Test1 {

	int a, b;

	Test1(int i, int j) {

		a = i;
		b = j;

	}

	void meth(Test1 o) {

		o.a *= 2;
		o.b /= 2;

	}

}
