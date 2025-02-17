package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
	
//		int sum = 0, n;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수(n) 을 입력");
//		n = sc.nextInt();
//		
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.printf("%d+", i);
//			sum += i;
//		} //for i
//		System.out.printf("\b=%d", sum);
		
		int sum = 0, n;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(n) 을 입력");
		n = sc.nextInt();
		if (n<1) {
			System.out.println("양의 정수만 입력");
			return;
		} //if
		
		
		while (++i <= n) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		
		System.out.printf("\b=%d", sum);
		
		
		
	}//main
	
}//class
