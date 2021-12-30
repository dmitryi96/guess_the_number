package com.compan_guess_the_number;

import java.util.Scanner;
//угадай число
public class Main {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i += 1) {
            System.out.println(i);
        }
//        System.out.println("Ваша задача угадать число");
//        int range = 18;
//        int number = (int) (Math.random () * range);
//        playLevel(18,number);
//        scanner.close();
    }
    private static void playLevel(int range,int number) {
        while (true) {
            System.out.println("Угадайту число от 0 до " + range);
            int input_namber = scanner.nextInt();
            if (input_namber == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_namber > number) {
                System.out.println("загаданое число меньшне");
            } else {
                System.out.println("загаданое число больше");
            }
        }}}