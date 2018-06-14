
public class BoxDemo3 {

	public static void main(String[] args) {

		Boxx myBox1 = new Boxx();
		Boxx myBox2 = new Boxx();

		/* Assigning values to myBox1's instance variables */

		myBox1.width = 10;
		myBox1.depth = 15;
		myBox1.height = 20;

		/* Assigning values to myBox2's instance variables */
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;

		// display volume of first box
		myBox1.volume();

		// display volume of second box
		myBox2.volume();
	}

}

class Boxx {

	double width;
	double height;
	double depth;

	void volume() {
		System.out.print("Volume is :");
		System.out.println(width * height * depth);
	}

}