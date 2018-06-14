
class BoxDemo {
	public static void main(String args[]) {
		Box mybox1 = new Box(1, 2, 3);
		Box mybox2 = new Box(3, 4, 5);
		double vol;
		// assign values to mybox1's instance variables

		/*
		 * assign different values to mybox2's instance variables
		 */

		// compute volume of first box
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);
		// compute volume of second box
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);
	}
}