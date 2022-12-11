package org.alla;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Взять домашнюю работу за 7 ноября и
//        решить задачу второго уровня в "функциональном" стиле.
//            То есть разбить код на методы
//        Level2:
//        С консоли вводится трехзначное число. Найдите в нем первую, вторую и третью цифры.
//        Используйте при этом / и (или) %

        int numberThird = getNumberFromConsole();
        firstSymbol(numberThird);
        secondSymbol(numberThird);
        thirdSymbol(numberThird);

        }
    public static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

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

