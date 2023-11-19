package methods;

public class Non_Static_Class {
	public static void main(String[] args) {
		Non_Static_Class NJ = new Non_Static_Class();
		NJ.NY();
		Non_Static_Class.CA();
		
	}
	
	public void NY() {
		
		int x = 10;
		int y = 100;
		System.out.println(y);
	}

	public static void CA() {
		String x = "Sakif";
		System.out.println(x);
	}
}
