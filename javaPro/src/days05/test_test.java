package days05;

import java.util.Random;

public class test_test {

	public static void main(String[] args) {
//		14 <=    <= 87 사이의 정수 3개 출력하는 코딩을 하세요 .
		Random ran = new Random();
		int num;
		
		for (int i = 1; i <= 3; i++) {
			num = (int)(Math.random()*74)+14;
			System.out.printf("[%d]", num);
		} //for i
		
  }//main
}//class

