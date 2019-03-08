
public class App {
	public static void main(String[] args) {
		int currentYear = 2019;
		int yearsCounted= 0;
		while(yearsCounted<=20) {
		if(currentYear % 4 == 0 & (currentYear % 100 != 0 || currentYear % 400 == 0)) {
			System.out.println(currentYear);
			yearsCounted++;
			}
		currentYear++;	
		}
	}
}

