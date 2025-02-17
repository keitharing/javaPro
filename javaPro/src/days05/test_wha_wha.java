package days05;

import java.util.Scanner;

public class test_wha_wha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = "홍길동";
		int kor;
		int mat;
		int eng;
		int tot;
		double avg;
		
		
		
		
		System.out.println("이름, 국어, 수학, 영어, 입력");
		name = sc.next();
		kor = sc.nextInt();
		mat = sc.nextInt();
		eng = sc.nextInt();
		
		
		tot = (kor+mat+eng);
		avg = (double)tot/3;
		
		System.out.printf("이름 = \"%s\", 국어 = %d, 수학 = %d, 영어 = %d, 총점 = %d, avg = %.2f", name, kor, mat, eng, tot, avg);
		
		
		
	}
	
}
