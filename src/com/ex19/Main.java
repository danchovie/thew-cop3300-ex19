/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int height, weight;
        double bmi;
        System.out.print("Enter a height: ");
        height = newScanner.nextInt();
        System.out.print("Enter a weight: ");
        weight = newScanner.nextInt();
        bmi = ((double)weight/(height*height))*703;
        System.out.printf("Your BMI is %.1f.",bmi);
        if(bmi>=18.5&&bmi<=25){
            System.out.print("You are within the ideal weight range.");
        }
        else if(bmi<18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else{
            System.out.print("You are overweight. You should see your doctor.");
        }
    }
}
