/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Hicks
 */

package com.example.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("What is the input string? ");
        String in = input.next();
        System.out.println(in+" has "+in.length()+" characters.");
    }
}
