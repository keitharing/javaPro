package days09;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class wha {
    public static void main(String[] args) {
    	

 	String card = "7655-8988-9234-5677";
 	
 	String [] cardArr = card.split("-");
 	
 	Random ran = new Random();
 	int index = ran.nextInt(1);
 	
 	cardArr[index] = "****";
 	System.out.printf("7655-%s-%s-%s\n", cardArr[0], cardArr[0], cardArr[3]);
 	System.out.printf("%s-%s-%s-%s\n", cardArr[0], cardArr[1], cardArr[2], cardArr[0]);
    	
    	
    	
    }//main
}//claSS