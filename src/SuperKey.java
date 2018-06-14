
public class SuperKey {
	public static void main(String[] args) {

		BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
		BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.076);
		BoxWeight1 myBox3 = new BoxWeight1();
		BoxWeight1 myBox4 = new BoxWeight1(3, 2);
		BoxWeight1 myClone = new BoxWeight1(myBox1);

		double Vol;

		System.out.println("Volume of box1  : " + myBox1.volume());
		System.out.println("Weight of box1 : " + myBox1.weight);
		System.out.println();

		System.out.println("Volume of box2  : " + myBox2.volume());
		System.out.println("Weight of box2 : " + myBox2.weight);
		System.out.println();

		System.out.println("Volume of box3 : " + myBox3.volume());
		System.out.println("Weight of box3 : " + myBox3.weight);
		System.out.println();

		System.out.println("Volume of box4  : " + myBox4.volume());
		System.out.println("Weight of box4 : " + myBox4.weight);
		System.out.println();

		System.out.println("Volume of myClone  : " + myClone.volume());
		System.out.println("Weight of myClone : " + myClone.weight);

	}
}

class Box3 {

	private double width;
	private double height;
	private double depth;

	Box3(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box3() {

		width = -1;
		height = -1;
		depth = -1;
	}

	Box3(double len) {
		width = height = depth = len;
	}

	Box3(Box3 o) {
		width = o.width;
		height = o.height;
		depth = o.depth;
	}

	double volume() {
		return width * height * depth;
	}
}

class BoxWeight1 extends Box3 {

	double weight;

	BoxWeight1(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;

	}

	BoxWeight1() {
		super();
		weight = -1;
	}

	BoxWeight1(double len, double m) {
		super(len);
		weight = m;
	}

	BoxWeight1(BoxWeight1 ob) {
		super(ob);
		weight = ob.weight;
	}
}
