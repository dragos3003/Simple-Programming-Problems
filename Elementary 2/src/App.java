import java.util.Scanner;

public class App {

	private static Scanner scanName;

	public static void main(String[] args) {
		scanName = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String name = scanName.next();
		System.out.println("Hello " + name);
		
		

	}
}