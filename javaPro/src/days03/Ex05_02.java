package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 * @date 2025. 2. 5. - 오후 12:20:28
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		
		//[문제]국어점수를 키보드로 부터 입력받아서 
		//변수에 저장하고 
		//"국어=90" 이라고 출력하는 코딩을 하자
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//String kor;
		
		//System.out.print(">국어점수는");
		//Type mismatch: cannot convert from String to byte
		//kor = br.readLine();
		
		//System.out.printf("국어=%s\n", kor);
		
		//---------------------------------------------------------------------------------
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte kor;
		
		System.out.print(">국어점수는");
		//Type mismatch: cannot convert from String to byte
		//String -> byte 타입으로 바꾸기
		//String strKor = br.readLine();
		// kor = Byte.parseByte(input); - Ai 검색
		
		//String "90" -> byte 90 변환하는 코딩.
		kor = Byte.parseByte(br.readLine());
		System.out.printf("국어=%s\n", kor);
		
		
		
		
		
		
		
		
	}
}
