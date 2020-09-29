import java.util.Random;

public class dice0106 {

	public static void main(String[] args) {
		
		Random randomnumber = new Random ();
		int A = randomnumber.nextInt(8);
		
		System.out.println("the rolled number is: " +A);

	}

}
