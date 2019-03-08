import java.util.Scanner;

public class App {
	private static Scanner number;

	public static void main(String[] args) {
		number = new Scanner(System.in);
		System.out.println("Introduce number: ");
		int n = number.nextInt();
		int sum=0;
		while(n!=0) {
			sum=sum+n;
			n--;
		}
		System.out.println(sum);
	}
}
