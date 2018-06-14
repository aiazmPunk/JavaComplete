import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a side of triangle ABC\n");
		double a = sc.nextDouble();

		System.out.println("Enter the b side  of triangle ABC\n");

		double b = sc.nextDouble();

		double c = Math.sqrt(a * a + b * b);

		System.out.println("The hypotenuse of triangle ABC is :" + c);
	}

}
