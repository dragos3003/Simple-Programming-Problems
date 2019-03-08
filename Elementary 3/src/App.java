import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	private static Scanner scanName;

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		
		scanName = new Scanner(System.in);
		System.out.println("What's your name?");
		
		String name = scanName.next();
		if(names.contains(name)) {
			System.out.println("Hello " + name);
		}
		else {
			System.out.println("Sorry, I don't know you");
		}
	}
}
