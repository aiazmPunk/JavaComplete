
public class Final {

	final void call() {

		System.out.println("Cant be overridden");
	}

}

class Lolwa extends Final {

	void call() {   //as method is declared final it cant be overridden
		System.out.println("Illegal");
	}
}
