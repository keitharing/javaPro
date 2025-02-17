//package days10;
//
//import java.io.IOException;
//import java.util.Random;
//import java.util.Scanner;
//
//public class wha {
//
//	public static void main(String[] args) throws IOException {
//		String name;
//		int kor, eng, mat, tot, rank;
//		double avg;
//		
//		final int STUDENT_COUNT = 30;
//		
//		String [] names = new String[STUDENT_COUNT];
//		int [] kors = new int[STUDENT_COUNT];
//		int [] engs = new int[STUDENT_COUNT];
//		int [] mats = new int[STUDENT_COUNT];
//		int [] tots = new int[STUDENT_COUNT];
//		int [] ranks = new int[STUDENT_COUNT];
//		double [] avgs = new double[STUDENT_COUNT];
//		
//		int cnt = 0;
//		char con = 'y';
//		
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//			System.out.printf("[$d] 이름, 국어, 영어, 수학", cnt + 1);
//			name = getName();
//			kor = getScore();
//			eng = getScore();
//			mat = getScore();
//			
//			tot = kor + eng + mat;
//			avg = (double)tot/3;
//			rank = 1;
//			
//			names[cnt] = name;
//			kors[cnt] = kor;
//			engs[cnt] = eng;
//			mats[cnt] = mat;
//			tots[cnt] = tot;
//			avgs[cnt] = avg;
//			ranks[cnt] = rank;
//				
//			cnt ++;
//			
//			System.out.print("학생 입력 계속");
//			con = (char)System.in.read();
//			System.in.skip(System.in.available());
//			
//		} while ( Character.toUpperCase(con) == 'Y' );
//		
//		System.out.printf(" 입력 받은 학생수 : %d\n", cnt);
//		for (int i = 0; i < cnt; i++) {
//			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
//		} //for i
//		
//	}
//
//	private static int getScore() {
//		return  (int)(Math.random()*101);
//		
//	}
//
//	private static String getName() {
//		char [] nameArr = new char[3];
//		Random rnd = new Random();
//		for (int i = 0; i < nameArr.length; i++) {
//			nameArr[i] = (char)(rnd.nextInt('힣'-'가	'+1)+'가');
//		} //for i
//		String name = new String(nameArr);
//		return name;		
//		
//	}
//	
//}//class
//
