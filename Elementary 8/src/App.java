
public class App {
	public static void main(String[] args) {
		int number=2;

		// while loop for counting to infinity
		while(number!=-1) {
		int sumOfDivs=0;

		//for loop to calculate number of divisors the current number has
		for(int divisor = 1; divisor<=number; divisor++) {
			if(number%divisor==0) {
				sumOfDivs++;
			}
		}	
		if(sumOfDivs==2) {
			System.out.println(number);
		}
		number++;
		}
	}

}
