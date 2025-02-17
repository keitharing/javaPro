package days03;

public class Ex07_06 {

	public static void main(String[] args) {
		
		// ?: 삼항연산자 또는 조건연산자
		int x = 30, y;
		y = x > 10 ? 1 : 2;
		y = (x>5? (x<10? 1:2) : 200);
		System.out.println( y );
		
		/*
	
		 * 변수 선언:
x는 30으로 초기화됩니다.
y는 선언만 되고 초기화되지 않습니다.
삼항 연산자 사용:
조건: x > 10
조건이 참일 때: y에 1을 할당합니다.
조건이 거짓일 때: y에 2를 할당합니다.
출력:
System.out.println(y)는 변수 y의 값을 출력합니다.
실행 결과
x는 30이므로, 조건 x > 10은 참입니다.
따라서, y에 1이 할당됩니다.
출력 결과는 1입니다.
		 * 

		 * 
		 */
		
		

	}//main

}//class
