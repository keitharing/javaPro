package days06;

public class Ex03_03 {

	public static void main(String[] args) {
//		1~10 홀수의 합
//		for문 사용
		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
//			if(i % 2 !=0)	break;//break는 제어문을 빠져나갈때 사용
			System.out.printf("%d+", i);
			sum += i;
		} //for i
		
		System.out.printf("\b=%d\n", sum);
		
//		------------------------------------------------
		//while문 사용
		
		int n = 0;
		int i = 1;
		
		while (i <= 10) {
			
			System.out.printf("%d+", i);
			n += i;
			i+=2;
		}//
		System.out.printf("\b=%d\n", n);
		

		
	}//main
	
}//class
