import java.util.Random;

public class Otp {

	public static void main(String[] args) {

		Random n = new Random();

		int otp = n.nextInt();

		System.out.println(otp);

	}

}