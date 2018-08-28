package by.it.grudnitskynick.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextInt();
        double payment1 = payment * 1.5;
        if (payment > 3000 || payment < 300) {
            System.out.println("Мы вам перезвоним!");
        } else {
            for (int month = 0; month < 15; month++) {
                if (month == 0 || month == 13 || month == 14) {
                    System.out.println("За месяц " + month + " начислено $0.0");
                } else {
                    switch (month) {
                        case 1:
                            if (payment1 == 666) {
                                System.out.println("За январь начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За январь начислено $" + payment1);
                                break;
                            }
                        case 2:
                            if (payment1 == 666) {
                                System.out.println("За февраль начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За февраль начислено $" + payment1);
                                break;
                            }
                        case 3:
                            if (payment1 == 666) {
                                System.out.println("За март начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За март начислено $" + payment1);
                                break;
                            }
                        case 4:
                            if (payment1 == 666) {
                                System.out.println("За апрель начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За апрель начислено $" + payment1);
                                break;
                            }
                        case 5:
                            if (payment1 == 666) {
                                System.out.println("За май начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За май начислено $" + payment1);
                                break;
                            }
                        case 6:
                            if (payment == 666) {
                                System.out.println("За июнь начислено $" + payment);
                                return;
                            } else {
                                System.out.println("За июнь начислено $" + payment);
                                break;
                            }
                        case 7:
                            if (payment1 == 666) {
                                System.out.println("За июль начислено $" + payment);
                                return;
                            } else {
                                System.out.println("За июль начислено $" + payment);
                                break;
                            }
                        case 8:
                            if (payment1 == 666) {
                                System.out.println("За август начислено $" + payment);
                                return;
                            } else {
                                System.out.println("За август начислено $" + payment);
                                break;
                            }
                        case 9:
                            if (payment1 == 666) {
                                System.out.println("За сентябрь начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За сентябрь начислено $" + payment1);
                                break;
                            }
                        case 10:
                            if (payment1 == 666) {
                                System.out.println("За октябрь начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За октябрь начислено $" + payment1);
                                break;
                            }
                        case 11:
                            if (payment1 == 666) {
                                System.out.println("За ноябрь начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За ноябрь начислено $" + payment1);
                                break;
                            }
                        case 12:
                            if (payment1 == 666) {
                                System.out.println("За декабрь начислено $" + payment1);
                                return;
                            } else {
                                System.out.println("За декабрь начислено $" + payment1);
                                break;
                            }
                    }
                }
            }
        }
    }
}
