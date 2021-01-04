package com.company;

import java.util.Scanner;

public class ReadClass {

        public double readNextDouble() {
            Scanner sc = new Scanner(System.in);
            double i = 0 ;
            if (sc.hasNextDouble()) {
                i = sc.nextDouble();}

            else {
                System.out.print("Вы ввели не  число");}
            return  i;
        }


    }


