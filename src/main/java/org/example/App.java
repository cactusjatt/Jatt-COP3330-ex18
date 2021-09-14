/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        String newLine = System.getProperty("line.separator");
        System.out.println("Press C to convert from Fahrenheit to Celsius" + newLine + "Press F to convert from Celsius to Fahrenheit");
        System.out.print("Your choice: ");
        char unit = in.next().charAt(0);

        String temp_type = unit == 'C' || unit == 'c'? "Fahrenheit" : "Celsius";
        System.out.print("Please enter the temperature in " + temp_type + ": ");
        int Temp = in.nextInt();

        int convert = unit == 'C' || unit == 'c'? (Temp - 32) * 5 / 9 : (Temp * 9 / 5) + 32;

        String temp_type_inv = unit == 'C' || unit == 'c'? "Celsius" : "Fahrenheit";
        System.out.println("The temperature in " + temp_type_inv + " is " + convert + ".");
        in.close();
    }
}