package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:13:16
 * @subject 
 * @content
 */
public class Ex04_06_02 {

   public static void main(String[] args) {
      // 세 정수(n,m,o) 중에 가장 큰값, 작은값 
      // [문제] 여러 20개의 정수 중에 가장 큰값, 작은값 출력
      //      ( 배열을 사용해서 처리 )
      
      // 배열의 초기화
	  //람다 스트림 이용해서 - 무조건 암기
      int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
  
      OptionalInt max = IntStream.of(m).max();
      
      if (max.isPresent()); {
    	  
    	  System.out.println(max.getAsInt());
    	  
      }//if
      
//      max = new Random().ints(0, 101). limit(10).max();

   } // main

} // class




