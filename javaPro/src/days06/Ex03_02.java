package days06;

import java.util.concurrent.locks.Condition;

public class Ex03_02 {

	public static void main(String[] args) {
		//1~10 = 55
		
//		int n = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			if (i==10) {
//				System.out.printf("%d", i);
//			} else {
//				System.out.printf("%d+", i);
//			}
//			n += i;
//		} //for i
//		System.out.printf("=%d", n);
		
		
//		//countinue 문 설명
//		int n = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) continue;
//				
//			System.out.printf("%d+", i);
//			n += i;
//		} //for i
//		System.out.printf("\b=%d\n", n);

		int n = 0;
		int i = 1;
		
		while (i <= 10) {
			if (i % 2 == 0) {
				i++;
				continue;
				}
			System.out.printf("%d+", i);
			n += i;
			
		}//
		System.out.printf("\b=%d\n", n);

		
		
	}//main

}//class
