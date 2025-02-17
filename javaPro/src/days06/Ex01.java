package days06;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
//		int num;
//		for (int i = 1; i < 7; i++) {
//			num = (int)(Math.random()*45)+1;
//			System.out.printf("[%d]", num);
//			
//		} //for i
//		System.out.println();
		
//		 [풀이] 중복 제거 후 로또 번호 6개 출력..
//	      int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
//	      int n ;// 
//	      n =  (int)( Math.random()*45)+1;
//	      // 1
//	      lotto1 = n;
//	      // 2
//	      n =  (int)( Math.random()*45)+1;
//	      if( lotto1 == n ) {
//	         n =  (int)( Math.random()*45)+1;
//	         if (lotto1 == n) {
//	            n =  (int)( Math.random()*45)+1;
//	            if (lotto1 == n) {
//	               n =  (int)( Math.random()*45)+1;
//	               if (lotto1 == n) {
//	                  n =  (int)( Math.random()*45)+1;
//	                  if (lotto1 == n) {
//	                     
//	                  } else {
//	                     lotto2 = n;
//	                  } // if
//	               } else {
//	                  lotto2 = n;
//	               } // if
//	            } else {
//	               lotto2 = n;
//	            } // if
//	         } else {
//	            lotto2 = n;
//	         } // if
//	      }else {
//	         lotto2 = n;
//	      }
		
		//배열선언
		int index = 0, num;
		int [] lotto = new int[6];
		lotto[index] = (int)(Math.random()*45)+1; //첫번째 숫자는 중복될일이없기때문에 미리 넣는과정.
		//2번째방인 1번째 방부터 넣는 작업 - while문 사용
		while (index<=5) {
			num = (int)(Math.random()*45)+1;
			//그이전에 발생한 로또 번호와 n값과 모두 체크해서 중복이 되지않으면 다음방에 체워넣기
			boolean flag = false;
			for (int i = 0; i < index; i++) {
				if(lotto[i] == num) {
					System.out.println("*");// 중복된게 있으면 확인할수있는 작업
					flag = true;
					break;
				}
			} //for i
			
			if( !flag )lotto[index++] = num;
		}
		

		System.out.println(Arrays.toString(lotto));
	
  }
}