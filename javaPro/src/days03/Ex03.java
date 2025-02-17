package days03;

/**
 * @author user
 * @date 2025. 2. 5. - 오전 11:04:31
 * @subject
 * @content 프로그램에서 두기억공간 위치 바꾸기
 */
public class Ex03 {

	public static void main(String[] args) {
		//[시험] 두 기억공간의 값을 바꾸기
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);
		{
			int temp = x;		//10
			x = y;				//20
			y = temp;			//10
		}
		System.out.printf("> x=%d, y=%d\n", x, y);
		
	}
	
	
}
