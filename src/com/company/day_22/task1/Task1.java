package com.company.day_22.task1;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(inputNumber());
    }

    public static int inputNumber() {

        boolean b = true;
        int number = 0;
        while (b) {

            String str = sc.nextLine();

            try {

                number = Integer.parseInt(str);
                b = false;
            } catch (NumberFormatException e) {

                System.out.println("Input number type!!!");
            }catch (Exception e) {

                System.out.println("Input number type!!!");
            }

        }

        return number;
    }
}
