package days08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		
		// days03.Ex06_02
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		name = getName(sc);
		kor = getScore(sc, "국어");
		eng = getScore(sc, "영어");
		mat = getScore(sc, "수학");		
		tot = getTotal(kor, eng, mat);
		avg = getAvg(tot);
		
		printScore(name, kor, eng, mat, tot, avg);

	}// main

	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		System.out.printf(">이름=\"%s\", 국어=%d,영어=%d,수학=%d,총점=%d,평균=%5.2f", name, kor, eng, mat, tot, avg);
	}

	private static double getAvg(short tot) {
		return (double) tot / 3;
	}

	private static short getTotal(byte kor, byte eng, byte mat) {
		return (short) (kor + eng + mat);
	}

	private static byte getScore(Scanner sc, String subject) {
		byte score;
		String strScore;
//		String regex = "[0-9]{1,3}";
		String regex = "^(100|[1-9]?\\d)$";
		boolean isFirst = false;
		
		do {
			if (isFirst) {
				System.out.print("[다시] ");
			} //if
			System.out.printf("%s 점수를 입력하시오", subject);
			strScore = sc.next();
			isFirst = true;
		} while (!strScore.matches(regex));
		
		score = Byte.parseByte(strScore);
		
		return score;
	}

	private static String getName(Scanner sc) {
		System.out.print("이름을 입력하시오");
		String name = sc.next();
		return name;

	}//main

}// class
