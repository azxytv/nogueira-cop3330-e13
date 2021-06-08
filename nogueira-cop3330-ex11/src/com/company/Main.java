package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner eu = new Scanner(System.in);
        Scanner ex = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double euros = eu.nextDouble();
        System.out.println("What is the exchange rate?");
        double exc = ex.nextDouble();
        double usd = euros*exc;

        System.out.println( euros + " euros at an exchange rate of " + exc + " is " + usd + " U.S. dollars. ");


    }
}
