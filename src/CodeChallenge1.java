import java.util.Scanner;


public class CodeChallenge1 {

	public static void main(String[] args) {
		/*
		 * Your goal: Determine what a user should wear based on the 
		 * type of event they're attending and the temperature outside.
		 * 
		 * Options: 
		 * eventType should be used as a condition for eventClothing
		 *  casual = something comfy
		 *  semi-formal = business casual or a polo
		 *  formal = a suit
		 *  
		 * temperature should be used as a condition for tempClothing 
		 *  temperature < 54 = a coat
		 *  temperature > 74 = no jacket
		 *  temperature between 54 and 74 = a jacket
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What type of event is it?: ");
		
		String eventType = scan.next();
		
		System.out.println("What is the temperature outside?: ");
		
		double temp = scan.nextDouble();
		
		if (eventType.equals("casual") ) {
			if (temp < 54) {
				System.out.println("Somthing comfy and a coat" + temp);
			} else if (temp > 74) {
				System.out.println("Somthing comfy and no jacket");
			} else {
				System.out.println("Something comfy and a jacket");
			}
			
		}

		if (eventType.equals("semi-formal")) {
			if (temp < 54) {
				System.out.println("Business casual or a polo and a coat");
			} else if (temp > 74) {
				System.out.println("Business casual or a polo and no jacket");
			} else {
				System.out.println("Business casual or a polo and a jacket");
			}
			
		}
		
		if (eventType.equals("formal")) {
			if (temp < 54) {
				System.out.println("A suit and a coat");
			} else if (temp > 74) {
				System.out.println("A suit and no jacket");
			} else {
				System.out.println("A suit and a jacket");
			}
			
		}
		
		scan.close();
	}

}
