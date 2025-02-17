package days06;

import java.util.Scanner;

public class Ex04_04 {
	//for/while 두정수 (n, m)을 입력 받아서 두정수 사이의 홀수의 합을 출력.
	public static void main(String[] args) {
	      int n, m ;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m ) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      
	      int sum = 0;
	      
	    
	      int min = n > m ? m : n ;
	      int max = Math.max(n, m);

	      if(min % 2 == 0) min++; 
	      
	      while ( min <= max) {
			System.out.printf("%d+", min);
			sum += min;
			min+=2;
	       }

	      System.out.printf("\b=%d\n", sum);

	}//main
}//class




