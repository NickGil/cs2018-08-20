package by.it.grudnitskynick.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        int numb;
        while (true) {
            if (list.size() == 20) {
                break;
            } else {
                numb = sc.nextInt();
                list.add(numb);
            }
        }
        for (int i = 0; i < 20; i++) {
            int a = list.get(i);
            if (a % 6 == 0) {
                array1.add(a);
                array2.add(a);
            } else {
                if (a % 3 == 0) {
                    array1.add(a);
                } else {
                    if (a % 2 == 0) {
                        array2.add(a);
                    } else {
                        array3.add(a);
                    }
                }
            }
        }
        printList(array1);
        printList(array2);
        printList(array3);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}









