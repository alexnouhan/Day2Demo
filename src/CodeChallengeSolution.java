import java.util.Scanner;

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
public class CodeChallengeSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What kind of event?: ");
		String eventType = scan.next();
		
		boolean z = false;

		String eventClothing, tempClothing;

		// Write your code here
		do {

			switch (eventType.toLowerCase()) {
			case "casual":
				eventClothing = "something comfy";
				z = true;
				break;
			case "semi-formal":
				eventClothing = "business casual or a polo";
				z = true;
				break;
			case "formal":
				eventClothing = "a suit";
				z = true;
				break;
			default:
				System.out.println("Please, only enter casual, semi-formal, or formal");
				System.out.print("What kind of event?: ");
				eventType = scan.next();
				z = false;
			}
		} while (z == false);

		System.out.println("What's the temperature?: ");
		int temperature = scan.nextInt();
		
		
		
		// Your code should end here!
//		System.out.println("Because it's " + temperature + " degrees and you're going to a " + eventType
//				+ " event, you should wear " + eventClothing + " and " + tempClothing + ".");

		scan.close();
	}
}