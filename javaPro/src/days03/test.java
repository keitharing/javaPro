package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String name;
			byte kor, eng, mat;
			short tot;
			double avg;
			
			System.out.print("이름");
			name = br.readLine();
			System.out.print("국어");
			kor = Byte.parseByte(br.readLine());
			System.out.print("영어");
			eng = Byte.parseByte(br.readLine());
			System.out.print("수학");
			mat = Byte.parseByte(br.readLine());
			
			
			tot = (short) (kor+eng+mat);
			avg = (double) tot/3;
			
			System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name, kor, eng, mat, tot, avg);
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
	
	
		
	}
		
	
