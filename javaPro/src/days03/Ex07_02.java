package days03;

public class Ex07_02 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		
		
		System.out.println(i+j); //13
		System.out.println(i-j); //7
		System.out.println(i*j); //30
		System.out.println((double)i/j); //3
		System.out.println(i%j);
		
//		[주의할 점] /%0 항상 0을 나눌때 조심해야함
//		System.out.println(10%0);	//by zero ArithmeticException
		System.out.println(10.0/0); //Infinity
		System.out.println(10.0%0);	//NaN - Not a Number 숫자가 아니다.
		
		
		
		
	}

}
