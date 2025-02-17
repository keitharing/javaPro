package days06;

import java.util.concurrent.locks.Condition;

public class Ex03 {

	public static void main(String[] args) {


//		int n = 0;
//		int i = 1;
//		
//		while (i <= 10) {
//			if (i % 2 == 0) {
//				i++;
//				continue;
//				}
//			System.out.printf("%d+", i);
//			n += i;
//			i++;
//		}//
//		System.out.printf("\b=%d\n", n);

	      int n = 0;
	      int i = 0;
	      
	      while (++i <= 10) {
	         if (i % 2 == 0) continue;
	         System.out.printf("%d+", i);
	         n += i;
	      }
	      System.out.printf("\b=%d\n", n);
		
		
	}//main

}//class
