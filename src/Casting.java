
public class Casting {

	public static void main(String[] args) {

		int i = 257;
		byte b;
// How to cast verylong value to int	int c =  (int)1000000000000000000L;
		double d = 323.142;
		System.out.println("\n Converstion of int to byte");

		b = (byte) i;

		System.out.println("i and b is :" + i + " " + b);
		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);
		System.out.println("\nConversion of double to byte.");
		b = (byte) d;
		System.out.println("d and b " + d + " " + b);

	}

}
