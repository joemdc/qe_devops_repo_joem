package m2_activity;
import java.util.Scanner;

public class M2_Activity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calcu = new Calculator();
		int count;
		do {
			System.out.print("How many apples do you want to order? ");
			count = scan.nextInt();
			if (count != 0) {
				calcu.compute(count);
			}
		} while (count > 0);
		scan.close();
	}
}
