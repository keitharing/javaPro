package days03;

public class Ex07_07 {

	public static void main(String[] args) {

//		System.out.println( +3 );
//		System.out.println( -3 );
		
		// instanceof 연산자 : 클래스 수업x
		
		// [ 증감연산자 ++ -- ]
		// [문제]어떤 기억공간의 값을 1증가 시키는 코딩을 하세요
			int x = 10;
			//x = 11;
			//1) x = x + 1;
			//2) x += 1;
			//System.out.println( x );

		// [문제]어떤 기억공간의 값을 1감소 시키는 코딩을 하세요
//				int x = 10;
			//x = 11;
			//1) x = x - 1;
			//2) x -= 1;
			//System.out.println( x );
				
			//단독으로 증감 연산자를 사용 할때는 전위 형 == 후위형
//			x++; x--; // 1증가 시키거나 감소 시킬때 무조건 1
//			++x; --x; //	
				int y = ++x; //전위형
//				int y = x++; //후위형
			
			System.out.printf("> x=%d, y=%d\n", x, y);
			
			
	}
	
}
