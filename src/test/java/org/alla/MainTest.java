package org.alla;
import org.junit.Test;
import java.util.Scanner;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test(){
 //       Scanner scanner = new Scanner(System.in);
 //       int numberThird = getNumberFromConsole();
        int answerOfFirstSymbol = firstSymbol(451);//4
        assertEquals(4, answerOfFirstSymbol);
        int answerOfSecondSymbol = secondSymbol(451);//5
        assertEquals(5, answerOfSecondSymbol);
        int answerOfThirdSymbol = thirdSymbol(451);//1
        assertEquals(1, answerOfThirdSymbol);


    }
//    public static int getNumberFromConsole() {
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }
    public static int firstSymbol(int r) {
        int firstSymbol = r / 100;
        System.out.println("first symbol " + firstSymbol);
        return firstSymbol;
    }

    public static int secondSymbol(int r) {
        int secondSymbol = (r / 10) % 10;
        System.out.println("second symbol " + secondSymbol);
        return secondSymbol;
    }

    public static int thirdSymbol(int r) {
        int thirdSymbol = r % 10;
        System.out.println("third symbol " + thirdSymbol);
        return thirdSymbol;
    }

}