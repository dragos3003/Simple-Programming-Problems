import java.util.Scanner;

public class App {
	private static Scanner number;

	public static void main(String[] args) {
		number = new Scanner(System.in);
		System.out.println("Introduce number: ");
		int n = number.nextInt();
		int sum=0;
		if(n%5==0 || n%3==0) {
			while(n!=0) {
			sum=sum+n;
			n--;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Number not a multiple of 3 or 5");
		}
	}
}
