package days03;

public class Ex06 {

	public static void main(String[] args) {
		// Byte.parseByte("90") -> 90
		// int 가장 큰 값 : 2,147,483,647
		// long		"  : 900경
		
		// 래퍼(Warpper)클래스 - 기본형 int -> 기능이 구현된 클래스(물건, 부품, 객체, 개체)
		System.out.println(Integer.MAX_VALUE);
		String strKor = "90";
		// int kor = Integer.parseInt(strKor);
		//byte kor = Byte.parseByte(strKor);	//byte - 기본형, Byte - 레퍼클래스
		
		double kor = Double.parseDouble(strKor);
		
		// long -> Long
		// short -> Short
		// float -> Float
		// char -> Character
		
		
	}//main

}//class
