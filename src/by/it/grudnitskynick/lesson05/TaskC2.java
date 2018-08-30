package by.it.grudnitskynick.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    int t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
