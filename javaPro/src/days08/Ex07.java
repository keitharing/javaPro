package days08;

public class Ex07 {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		fillLotto(lotto);
		dispLotto(lotto);

	}// main

	private static void fillLotto(int[] lotto) {
		 int index = 0, n;	  
	     lotto[index++] = getRandomInteger(1, 45);
	      while ( index <= 5 ) {
	    	  n = getRandomInteger(1, 45);
	          if( !isDuplicateLotto(lotto, n, index)) lotto[index++] = n; 
	      }
	} // 로또 번호를 무작위로 생성하여 주어진 배열에 채우는 역할을 합니다. 로또 번호는 1부터 45까지의 숫자 중에서 중복되지 않도록 선택됩니다.

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		 boolean flag = false;
         for (int i = 0; i < index; i++) {
            if( lotto[i] == n ) {
               System.out.println("*");
               flag = true;
               break;
            }
         } // for i   

		return flag;
	}	//중복체크하는 함수

	private static int getRandomInteger(int min, int max) { 
		return (int)(Math.random()*(max-min+1))+min;
	}	//랜덤한값을 주는 함수

	private static void dispLotto(int[] lotto) {
		System.out.print("1게임 : ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]", lotto[i]);
		} // for i
		System.out.println();
	}

}// class
