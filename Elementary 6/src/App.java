import java.util.Scanner;

public class App {
	private static Scanner scanNumber;
	private static Scanner scanRespons;

	public static void main(String[] args) {
		scanNumber = new Scanner(System.in);
		scanRespons = new Scanner(System.in);
		
		System.out.println("Introduce a number: ");
		int n = scanNumber.nextInt();
		System.out.println("For Sum press 1. For Multiplication press 2");
		int respons = scanRespons.nextInt();
		int sum = 0;
		int multi = 1;
			
		if(respons == 1) {
				while(n!=0) {
					sum=sum+n;
					n--;
				}
				System.out.println("Result of sum is: " + sum);
			}
			
		else if(respons == 2) {
				while(n!=0) {
					multi=multi*n;
					n--;
				}
				System.out.println("Result of multiplication is: " + multi);
			}
		else if(respons !=1 || respons !=2) {
			System.out.println("Invalid option");
		}
	}
}
