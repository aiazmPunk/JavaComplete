
public class Array {
	public static void main(String[] args) {
		double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };

		double sum = 0; // outside scope variable
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];

		}
		double average = sum / nums.length;

		System.out.println(average);

	}

}
