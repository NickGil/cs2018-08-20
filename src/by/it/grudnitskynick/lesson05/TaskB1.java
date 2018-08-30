package by.it.grudnitskynick.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("string1");
        array.add("string2");
        array.add("string3");
        array.add("string4");
        array.add("string5");
        int a = array.size();
        System.out.println(a);
        for (String anArray : array) {
            System.out.println(anArray);
        }
    }
}
