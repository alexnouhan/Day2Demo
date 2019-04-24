import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your number grade?: ");
		
		int grade = scan.nextInt();
		
		if (grade > 100 || grade < 0) {
			System.out.println("Impossible");
		} else {
		
			if (grade >= 85) {
				System.out.println(grade + " = A");
			} else if (grade >= 70) {
				System.out.println(grade + " = B");
			} else if (grade >= 60) {
				System.out.println(grade + " = C");
			} else if (grade >= 50) {
				System.out.println(grade + " = D");
			} else {
				System.out.println(grade + " = F");
			}
		
		}
		System.out.println("Goodbye!");
		
		// this should be the end of my program
		scan.close();
		
	}

}
