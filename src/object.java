import java.util.Scanner;

public class object {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number ");

		int a = sc.nextInt();
		System.out.println("Enter second number ");

		int b = sc.nextInt();
		System.out.println("Enter third number ");

		int c = sc.nextInt();

		System.out.println("the average of three numbers is :" + average(a, b, c));

	}

	public static int average(int a, int b, int c) {

		int average = (a + b + c) / 3;
		return average;
	}
	
	

}
