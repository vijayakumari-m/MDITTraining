
public class ShortCalc {

	public static void main(String[] args) {
		
		String welcomemessage = "Welcome to my Short Calculator";
		
		int firstnumber = 10;
		int secondnumber = 20;
		
		double firstdecimal = 10.22;
		double seconddecimal = 9.11;
		
		int totalnumber = firstnumber + secondnumber;
		double totaldecimal = firstdecimal + seconddecimal;
		
		String results = "Results are: ";
		
		System.out.println(welcomemessage);
		System.out.println();
		System.out.println("============================");
		System.out.println(results + totalnumber);
		System.out.println(results + totaldecimal);

	}

}
