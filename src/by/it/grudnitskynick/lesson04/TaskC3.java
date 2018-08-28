package by.it.grudnitskynick.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

import java.util.Scanner;

public class TaskC3 {
    public static void main(String[] args) {
        int i = 2;
        int a = 2;
        int rez;
        while (a <= 10) {
            while (i <= 10) {
                rez = i * a;
                String number1 = word(a);
                String number2 = word(i);
                String number3 = word(rez);
                System.out.println(number1 + " умножить на " + number2 + " равно " + number3);
                i++;
            }
            a++;
            i = 2;
        }
    }

    private static String word(int a) {
        String number1 = new String();

        switch (a) {
            case 2:
                number1 = "два";
                break;
            case 3:
                number1 = "три";
                break;
            case 4:
                number1 = "четыре";
                break;
            case 5:
                number1 = "пять";
                break;
            case 6:
                number1 = "шесть";
                break;
            case 7:
                number1 = "семь";
                break;
            case 8:
                number1 = "восемь";
                break;
            case 9:
                number1 = "девять";
                break;
            case 10:
                number1 = "десять";
                break;
            case 12:
                number1 = "двенадцать";
                break;
            case 14:
                number1 = "четырнадцать";
                break;
            case 16:
                number1 = "шестнадцать";
                break;
            case 18:
                number1 = "восемнадцать";
                break;
            case 20:
                number1 = "двадцать";
                break;
            case 15:
                number1 = "пятнадцать";
                break;
            case 21:
                number1 = "двадцать один";
                break;
            case 24:
                number1 = "двадцать четыре";
                break;
            case 27:
                number1 = "двадцать семь";
                break;
            case 30:
                number1 = "тридцать";
                break;
            case 32:
                number1 = "тридцать два";
                break;
            case 36:
                number1 = "тридцать шесть";
                break;
            case 40:
                number1 = "сорок";
                break;
            case 25:
                number1 = "двадцать пять";
                break;
            case 35:
                number1 = "тридцать пять";
                break;
            case 45:
                number1 = "сорок пять";
                break;
            case 50:
                number1 = "пятьдесят";
                break;
            case 42:
                number1 = "сорок два";
                break;
            case 48:
                number1 = "сорок восемь";
                break;
            case 54:
                number1 = "пятьдесят четыре";
                break;
            case 60:
                number1 = "шестьдесят";
                break;
            case 28:
                number1 = "двадцать восемь";
                break;
            case 49:
                number1 = "сорок девять";
                break;
            case 56:
                number1 = "пятьдесят шесть";
                break;
            case 63:
                number1 = "шестьдесят три";
                break;
            case 70:
                number1 = "семьдесят";
                break;
            case 64:
                number1 = "шестьдесят четыре";
                break;
            case 72:
                number1 = "семьдесят два";
                break;
            case 80:
                number1 = "восемьдесят";
                break;
            case 81:
                number1 = "восемьдесят один";
                break;
            case 90:
                number1 = "девяносто";
                break;
            case 100:
                number1 = "сто";
                break;
        }
        return number1;
    }

}
