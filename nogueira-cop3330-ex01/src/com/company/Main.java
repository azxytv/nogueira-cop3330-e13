package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	* UCF COP3330 Summer 2021 Assignment 1 Solution
	* Copyright 2021 adam nogueira
	 */

     System.out.println("What is your name?");

     String inname;

     Scanner scanIn = new Scanner(System.in);
     inname = scanIn.nextLine();

        scanIn.close();
        System.out.println("Hello," + inname +", nice to meet you!");



    }
}
