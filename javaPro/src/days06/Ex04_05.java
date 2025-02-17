package days06;

import java.util.Scanner;

public class Ex04_05 {
	// 세 정수를 입력받아서 세정수의 가장 큰값, 가장 작은 값을 구해서 출력
	public static void main(String[] args) {
		
		int n, m, t;
		Scanner sc = new Scanner(System.in);
		System.out.print("> 세 정수 값 입력: ");
		n = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();

		int min = Math.min(Math.min(n, m), t);
		int max = Math.max(Math.max(n, m), t);

		System.out.printf("가장 작은 값: %d\n", min);
		System.out.printf("가장 큰 값: %d\n", max);
		
	}//main
}//class
