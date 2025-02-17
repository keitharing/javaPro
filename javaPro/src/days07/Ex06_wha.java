package days07;

import java.util.Arrays;

public class Ex06_wha {
	public static void main(String[] args) {
		
		int index = 0, n;      
	      int [] m = new int[10];
	      m[index++] = (int)( Math.random()*100)+1;
	      // 1
	      while ( index < m.length ) {
	         n =  (int)( Math.random()*100)+1; 
	         boolean flag = false;
	         for (int i = 0; i < index; i++) {
	            if( m[i] == n ) {
	               System.out.println("*");
	               flag = true;
	               break;
	            }
	         } // for i    
	         if( !flag ) m[index++] = n;
	      } // while
	
		System.out.println(Arrays.toString(m));
	}//main
}
