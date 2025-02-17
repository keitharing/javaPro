package days06;

import java.util.Scanner;

public class Ex04_03 {
	public static void main(String[] args) {
		//for문 사용 두정수(n, m)을 입력 받아서 두 정수 사이의 합을 출력
		int n;
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n, m값을 입력하시오");
		n = sc.nextInt();
		m = sc.nextInt();
		
		int sum = 0;
		
		int min = n > m ? m : n;
		int max = Math.max(n, m);
		
		for (int i = min; i <= max; i++) {
			
			System.out.printf("%d+", i);
			sum += i;
			
		} //for i
		
		System.out.printf("\b=%d\n", sum);
		
		
		
	}//main
	
}
