package Lesson1;/*
Практическая работа.
1. Создать отдельные методы для сложения, вычитания, умножения двух целых чисел.
2. Создать перегруженные методы для сложения двух и трёх целых чисел, двух чисел с плавающей точкой, двух строк
 */

public class Calculator {
    public static void main(String[] args) {
        // базовые арифметические операции
        System.out.println("Сумма двух целых чисел " + add(1, 2));
        System.out.println("Разность двух целых чисел " + substract(2, 1));
        System.out.println("Произведение двух целых чисел " + multiply(1, 2));
        // перегруженные методы
        System.out.println("Сумма трех целых чисел " + add(1, 2, 3));
        System.out.println("Сумма двух  чисел с плавающей точкой " + add(1.2, 2.3));
        System.out.println("Сумма двух строк " + add("Easy", "Math"));
    }
    public static int add(int a,int b){  //метод сложения двух целых чисел
        return a + b;
    }
    public static int substract(int a,int b){ // метод разности двух целых чисел
        return a - b;
    }
    public static int multiply(int a,int b){ // метод умножения двух целых чисел
        return a * b;
    }
    public static int add(int a,int b, int c){ // перегруженный метод сложения трех целых чисел
        return a + b + c;
    }
    public static double add(double a,double b){ // перегруженный метод сложения двух чисел с плавающей точкой
        return a + b;
    }
    public static String add(String a,String b){ // перегруженный метод сложения двух строк
        return a + b;
    }

}
