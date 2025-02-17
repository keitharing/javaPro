package days03;

/**
 * @author user
 * @date 2025. 2. 5. - 오후 3:19:10
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		//int i = 100;
		
		int i = Integer.MAX_VALUE;
		int j = 200;
		long k = i + (long)j; //int 산술 오버플로워 발생,, 큰쪽으로 다 담길수있게 강제 형변환이 필요함.
		
		
		System.out.printf("%d + %d = %d \n", i , j, k);
		
		
		
		
	}

}
