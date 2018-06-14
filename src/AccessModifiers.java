
public class AccessModifiers {
	public static void main(String[] args) {

		Test3 ob = new Test3();

		ob.a = 2;
		ob.b = 4;

		ob.setc(5);

		System.out.println("a,b and c are : " + ob.a + " " + ob.b + " " + ob.getc());

	}
}

class Test3 {

	int a;
	public int b;

	private int c; // private variable

	void setc(int i) { // setting c value to public access
		c = i;
	}

	int getc() {
		return c;
	}

}
