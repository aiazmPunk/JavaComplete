
public class ReturningObject {
	public static void main(String[] args) {

		Test2 ob = new Test2(2);
		Test2 ob2;

		ob2 = ob.incrByTen();
		System.out.println("ob.a is : " + " " + ob.a);
		System.out.println("ob2.a is : " + " " + ob2.a);
	}
}

class Test2 {

	int a;

	Test2(int i) {
		a = i;
	}

	Test2 incrByTen() {

		Test2 temp = new Test2(a + 10);
		return temp;
	}

	
}