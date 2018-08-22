package by.it.grudnitskynick.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должно появиться в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        int number2 = scan2.nextInt();
        String rez = String.valueOf(number1 + number2);
        System.out.println("Sum = " + rez);
    }
}
