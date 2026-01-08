package  com.dailycode.BasicLogic.Lavel2;

import java.util.Scanner;

public class AlphabetRangeChecker {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch='e';
        int asc=(int) ch;
        if ((asc>=65 && asc<78) || (asc>=97 &&asc<110)){
            System.out.println("its lies b/w a to m");
        }else {
            System.out.println("its lies b/w n to z");
        }

    }
}