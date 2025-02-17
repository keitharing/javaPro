package days08;

public class wha {

    public static void main(String[] args) {
    	
    	int sum = 0;
    		for (int i = 1; i <= 100; i++) {
    			if ( isPrimeNumber(i) ) {
					System.out.printf("%d+", i);
					sum += i;
				} //if
				
			} //for i
    	
    		System.out.printf("=%d", sum);
    	
	}//main

	public static boolean isPrimeNumber(int n) {
		if (n == 1) {
			return false;
		} //if
		for (int i = 2; i < n; i++) {
			if ( n % i == 0) {
				return false;
			} //if
			
		} //for i
			return true;
	}
}

      