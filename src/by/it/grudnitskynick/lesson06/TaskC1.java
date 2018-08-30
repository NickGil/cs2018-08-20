package by.it.grudnitskynick.lesson06;

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Scanner sc = new Scanner(System.in);
        dog1.setName(sc.next());
        dog1.setAge(sc.nextInt());
        dog1.setWeight(sc.nextInt());
        dog1.setPower(sc.nextDouble());
        dog2.setName(sc.next());
        dog2.setAge(sc.nextInt());
        dog2.setWeight(sc.nextInt());
        dog2.setPower(sc.nextDouble());
        boolean win = dog1.win(dog2);
        if (win==true)  System.out.println(dog1.getName());
        if(win==false) System.out.println(dog2.getName());


    }

}

class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    boolean win(Dog otherDog){
       double chance1 = 0.2*this.age + 0.3*this.weight + 0.5*this.power;
       double chance2 = 0.2*otherDog.age + 0.3*otherDog.weight + 0.5*otherDog.power;
       boolean win;
       if (chance1>chance2) {
           win = true;
       } else {
           win = false;
       }
        System.out.println(chance1 + " " + chance2);
       return win;
    }

    public String toString() {
        String str = "Кличка: " + getName() + ". Возраст: " + getAge();
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) { this.power = power; }
}