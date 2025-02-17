package days07;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class wha {
	public static void main(String[] args) throws IOException {

//		int i = 2;
//		int j = 1;
//
//		while (i <= 9) {
//		    if (i == 1 || i == 3) {
//		        i++;
//		        continue;
//		    }
//		    
//		    System.out.printf("[%d단] : ", i);
//		    
//		    j = 1;
//		    while (j <= 9) {
//		        System.out.printf("%d*%d=%2d ", i, j, i * j);
//		        j++;
//		    }
//		    System.out.println();
//		    i++;
//		}
		
		
		int d = 2, i = 1;
		while ( d <= 9) {
			if(d==3) { 
				d++; 
				continue;
			}
			System.out.printf("[%d단] : ", d);
			
			i = 1;
			while (i <= 9) {
				System.out.printf(" %d*%d=%2d", d, i, d*i);
				i++;
			}
			System.out.println();
			d++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
