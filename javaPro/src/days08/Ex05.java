package days08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//오버로딩(==중복함수)
		//drawLine()
		//drawLine(int)
		//drawLine(int, String)
		
		
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("> x, y imput ? ");
		x = sc.nextInt();
		y = sc.nextInt();
		
//		result = x + y;
		//두정수의 합을 반환하는 sum() 메서드를 선언 -> 호출
		
		result = sum(x, y);	//메소드 호출부
		
		System.out.printf("%d+%d=%d\n", x, y, result);
		
		
		
		
	}//main
	
	//메소드 선언부
	private static int sum(int x, int y) {
//		int result = x + y;
//		return result;
		return x + y;
		
	}
	
}//class
