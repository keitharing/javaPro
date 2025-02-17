package days08;

public class Ex11_02 {

	public static void main(String[] args) {
		
		//재귀함수
		
		int result = recursiveSum(10);
		System.out.println( result );
		
		
	}

	private static int recursiveSum(int n) {
		if(n == 1) return 1;
		else	   return n + recursiveSum(n-1);
	}
	
}
