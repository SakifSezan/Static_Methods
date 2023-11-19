package firstpkg;

public class FirstClass_Non_Static {

	public static void main(String[] args) {
		FirstClass_Non_Static TX = new FirstClass_Non_Static();
		TX.S();
		

	}
	public void S() {
		int a = 100;
		int b = 501;
		int c = a*b;
		System.out.println(c);
	}

}
