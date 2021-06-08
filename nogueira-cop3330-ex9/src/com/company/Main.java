package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        Scanner q1 = new Scanner(System.in);

        Scanner p2 = new Scanner(System.in);
        Scanner q2 = new Scanner(System.in);

        Scanner p3 = new Scanner(System.in);
        Scanner q3 = new Scanner(System.in);




    System.out.println("Enter the price of item 1: ");
        int price1 = p1.nextInt();
    System.out.println("Enter the quantity of item 1: ");
        int qua1 = q1.nextInt();
    System.out.println("Enter the price of item 2: ");
        int price2 = p2.nextInt();
    System.out.println("Enter the quantity of item 2: ");
        int qua2 = q2.nextInt();
    System.out.println("Enter the price of item 3: ");
        int price3 = p3.nextInt();
    System.out.println("Enter the quantity of item 3: ");
        int qua3 = q3.nextInt();

        double sub = (price1 * qua1) + (price2 * qua2) + (price3 * qua3);
        double Tax = sub * .055;
        double total = sub + Tax;

        System.out.println("Subtotal: $" + sub);
        System.out.println("Tax: $" + Tax);
        System.out.println("Total: $" + total);




    }
}
