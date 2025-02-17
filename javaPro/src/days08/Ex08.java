package days08;

import java.util.Random;
import java.util.function.IntFunction;

public class Ex08 {

	public static void main(String[] args) {
		//[람다식과 스트림]
		new Random().ints(1,46).distinct().limit(6).sorted().mapToObj(i -> i+",").forEach(System.out::print);
		
		
		
	}//main
}//class

