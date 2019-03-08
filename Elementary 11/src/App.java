public class App{

	public static void main(String[] args) {
		
		double Sum=0;
		for(int k=1; k<=Math.pow(10, 6); k++) {
			System.out.println(k);
		double numerator = Math.pow((-1), k+1);
		int numitor = 2*k-1;
		float fraction = (float)numerator/numitor;
		Sum += fraction;
		}
		System.out.println(4*Sum);
	}
}
// corect/gresit??