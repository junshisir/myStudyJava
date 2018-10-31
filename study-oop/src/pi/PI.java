package pi;

public class PI{
	public double calculate (int count) {
		double sum=0;
		boolean positive = true;
		int n=0;
		for (int i = 0;; i+=2) {
			sum=sum+(positive ?4.0:-4.0)/i;
			positive=!positive;
			n++;
			if (n==count) {
				break;
			}
			
			
		}
		return sum;
	}

}
