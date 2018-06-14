
public class Operators {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 3;
		int d;
		int e;
		int f = -10;

		a += 2;
		System.out.println("The value of a is :" + a);

		b *= 4;
		System.out.println("The value of b is : " + b);

		c += a * b;
		System.out.println("The value of c is :" + c);

		c %= 6;
		System.out.println("The new value of c is :" + c);

		d = ++c;
		System.out.println("The value of d is :" + d);

		e = a++;
		System.out.println("The value of e is :" + e);

		int k = f < 0 ? -f : f;

		System.out.println("The value of k is :" + k);

		
	}
}
