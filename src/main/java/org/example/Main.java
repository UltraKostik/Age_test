package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println(checkAge(age));
        } else {
            System.out.println("Ошибка: введите число.");
        }
        scanner.close();
    }
    public static String checkAge(int number) {
        if (number < 0) {
            return "Возраст не может быть отрицательным.";
        } else if (number <= 18) {
            return "Вы несовершеннолетний.";
        } else if (number <= 52) {
            return "Да здравствует, Санкт-Петербург! 😎";
        } else if (number <= 120) {
            return "Библейский возраст.";
        } else {
            return "Вы легенда!";
        }
    }
}