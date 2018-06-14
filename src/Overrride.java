
public class Overrride {
	public static void main(String[] args) {

		E subOb = new E(1, 2, 3);
		subOb.show();
	}
}

class D {

	int i, j;

	D(int a, int b) {

		i = a;
		j = b;

	}

	void show() {
		System.out.println("i and j : " + i + " " + j);
	}

}

class E extends D {

	int k;

	E(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show() {
		super.show();
		System.out.println("k is : " + k);
	}

}