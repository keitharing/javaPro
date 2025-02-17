package days06;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		
		//[암기] 람다식과 스트림
		new Random().ints(1,46).distinct().limit(6).forEach(System.out::println);
		//스트림을 사용하였고 앞에했던 정수 6개를 중복되지 않게 출력 하라는 코드
		
		
		
	}//main
}
