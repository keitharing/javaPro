package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 * @date 2025. 2. 5. - 오후 2:12:47
 * @subject
 * @content // Type Convert( 형 변환)
			// 1) 자동 형 변환
			// 2) 강제 형 변환
			 
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		//[문제]
		//이름, 국어, 영어, 수학 점수를 입력받아서
		//총점
		//평균
		//출력
		//이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름입력");
		name = br.readLine();
		
		System.out.print("국어점수");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어점수");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학점수");
		mat = Byte.parseByte(br.readLine());
		
		
		tot = (short) (kor+eng+mat); //강제 형변한 을 해야함 tot는 short고 (kor+eng+mat)는 int기때문이다 그래서 (short)를 붙혀줌
		avg = (double) tot/3;
		
		System.out.printf(">이름=\"%s\", 국어=%d,영어=%d,수학=%d,총점=%d,평균=%5.2f", name, kor, eng, mat, tot, avg);
		
		
		
		
//		String strKor, strEng, strMat = br.readLine();
//		String strTot = br.readLine();
//		String strAvg = br.readLine();
//		kor = Byte.parseByte(strKor);
//		eng = Byte.parseByte(strEng);
//		mat = Byte.parseByte(strMat);
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
