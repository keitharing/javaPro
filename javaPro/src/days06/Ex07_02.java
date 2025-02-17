package days06;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:46:40
 * @subject 
 * @content
 */
public class Ex07_02 {

   public static void main(String[] args) {
      // [문제]  한 라인에 10개의 ASCII 문자를 출력
      // 윈도우 개행 : Carriage Return(CR) +    Line Feed(LF)
      //                   '\r' '13              '\n'10
      //                    
      // 리눅스  "  : LF
      /* 
       * 1: 0   1 2 3 4 5 6 7 8 9  개행
       * 2: 10 11              19  개행 
       * 3: 20 11              29  개행
       * 4: 30 
       * */
      // 4:05 
      for (int i = 0, lineNumber = 1; i < 256; i++) {
         // if(i%10==0) System.out.printf("%d :", i/10+1);
         if(i%10==0) System.out.printf("%d :", lineNumber++);
         System.out.printf("[%c]", (char)i);
         if(i%10==9) System.out.println();
      } // for i
      
      // 마지막 라인 : 6 [][][][][][]
      // 개행

   } // main

} // class
