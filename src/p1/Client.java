package p1;

public class Client implements Callback {

	public void callback(int p) {
		System.out.println("callback called with " + p);
	}

	void noncallbackMethod() {
		System.out.println("Classes that implement interfaces may define other methods too");
	}

}
