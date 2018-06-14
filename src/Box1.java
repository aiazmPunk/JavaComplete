
public class Box1 {

	public static void main(String[] args) {

		Boxxxx myBox1 = new Boxxxx(10, 20, 15);
		Boxxxx myBox2 = new Boxxxx();
		Boxxxx myCube = new Boxxxx();

		Boxxxx myClone = new Boxxxx(myBox1);

		double Vol;
		// get Volume of mybox1
		Vol = myBox1.volume();
		System.out.println("Print volume of mybox1 :" + Vol);

		// get Volume of mybox2
		Vol = myBox2.volume();
		System.out.println("Print volume of mybox2 :" + Vol);

		// get Volume of Cube
		Vol = myCube.volume();
		System.out.println("Print volume of myCube :" + Vol);

		// get Volume of myClone
		Vol = myClone.volume();
		System.out.println("Print volume of myClone :" + Vol);

	}
}

class Boxxxx {

	double width;
	double height;
	double depth;

	Boxxxx(double w, double h, double d) {

		width = w;
		height = h;
		depth = d;
	}

	Boxxxx() {

		width = -1;
		height = -1;
		depth = -1;

	}

	Boxxxx(double len) {

		width = height = depth = len;

	}

	Boxxxx(Boxxxx o) {

		width = o.width;
		height = o.height;
		depth = o.depth;
	}

	double volume() {
		return width * height * depth;
	}

}