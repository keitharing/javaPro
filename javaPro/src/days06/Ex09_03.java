package days06;

import java.io.IOException;

public class Ex09_03 {
    public static void main(String[] args) throws IOException {
        char one;

        System.out.print("> 한 문자 입력 ? ");
        one = (char) System.in.read();
        System.out.printf("%c\n", one);
        System.in.read(); // 버퍼에 남은 엔터 키 제거

        System.out.print("> 한 문자 입력 ? ");
        one = (char) System.in.read();
        System.out.printf("%c\n", one);
        System.in.read(); // 버퍼에 남은 엔터 키 제거

        
        one = (char) System.in.read();
        System.out.printf("%c\n", one);
    }
}
