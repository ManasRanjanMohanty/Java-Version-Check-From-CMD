
 import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the change value: ");
		int change = scanner.nextInt();

		int qtr  = change/25;

		change =change- (qtr*25);
		int dimes = change/10;
		change = change - (dimes*10);
		int nickel = change/5;
		change = change- (5*nickel);

		System.out.println(qtr+" quater(s)\n"+dimes+" dime(s)\n"+nickel+" nickel(s)\n"+change+" penni(es)");

	}

}
