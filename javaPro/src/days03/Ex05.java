package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		//[문제] 키보드로 부터 이름을 입력받아서 출력.  
		
		String name = null;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //암기
		
		System.out.print(">이름 입력? ");
		
		//Unhandled exception type IOException //
		name = br.readLine();
		
		System.out.printf("이름=%s\n", name);

	}

}
