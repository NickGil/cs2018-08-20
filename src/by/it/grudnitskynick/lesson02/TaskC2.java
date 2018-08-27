package by.it.grudnitskynick.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        int number2 = scan1.nextInt();
        int rez1 = number1 + number2;

        String binary1 = Integer.toBinaryString(number1);
        String binary2 = Integer.toBinaryString(number2);
        String rez2 = Integer.toBinaryString(rez1);

        String hex1 = Integer.toHexString(number1);
        String hex2 = Integer.toHexString(number2);
        String rez3 = Integer.toHexString(rez1);

        String oct1 = Integer.toOctalString(number1);
        String oct2 = Integer.toOctalString(number2);
        String rez4 = Integer.toOctalString(rez1);
        System.out.print("DEC:" + number1 + "+" + number2 + "=" + rez1 + "\n" +
                "BIN:" + binary1 + "+" + binary2 + "=" + rez2 + "\n" +
                "HEX:" + hex1 + "+" + hex2 + "=" + rez3 + "\n" +
                "OCT:" + oct1 + "+" + oct2 + "=" + rez4 + "\n");
    }

}
