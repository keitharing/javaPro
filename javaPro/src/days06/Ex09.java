package days06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char one = '\u0000';
		System.out.print(" 한 문자 입력 ?");
		
//		String input = sc.next();
//		one = input.charAt(0);
		
		one = sc.next().charAt(0);
		
		
		
		
		System.out.printf("%c\n", one);
		
		//"A" = 'A' + '\0'
		
		
	}//main
}//class
