
public class Abstract {

	public static void main(String[] args) {

		Figures figref;

		Rectangles r = new Rectangles(10, 10);
		Triangles t = new Triangles(4, 5);

		figref = r;
		System.out.println("Area of rectangles is : " + figref.area());

		figref = t;
		System.out.println("Area of rectangles is : " + figref.area());
	}
}

abstract class Figures {

	double dim1;
	double dim2;

	public Figures(double a, double b) {

		dim1 = a;
		dim2 = b;

	}

	abstract double area();

}

class Rectangles extends Figures {

	public Rectangles(double a, double b) {
		super(a, b);

		// TODO Auto-generated constructor stub
	}

	double area() {
		return dim1 * dim2;

	}

}

class Triangles extends Figures {

	public Triangles(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	double area() {
		return dim1 * dim2 / 2;
	}
}
