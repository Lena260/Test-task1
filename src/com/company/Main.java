package com.company;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

        public static void main(String[] args) {
            ReadClass readClass = new ReadClass();
            int activ;
            double one;
            double two;

            System.out.print("Введите первое число: ");
            one = readClass.readNextDouble();
            System.out.print("Введите второе число: ");
            two = readClass.readNextDouble();
            com.company.Calculator calculator = new com.company.Calculator(one, two);
            System.out.println("Выберете операцию: ");
            System.out.println("1.Сложить ");
            System.out.println("2.Вычесть ");
            System.out.println("3.Умножить ");
            System.out.println("4.Разделить ");
            System.out.println("5.Взять остаток ");
            System.out.println("0.Выход ");

            System.out.println(" Введите операцию : ");
            activ = (int) readClass.readNextDouble();
            switch (activ) {
                case 1:
                    System.out.print(calculator.add());
                    break;
                case 2:
                    System.out.print(calculator.subs());
                    break;
                case 3:
                    System.out.print(calculator.multi());
                    break;
                case 4:
                    System.out.print(calculator.div());
                    break;
                case 5:
                    System.out.print(calculator.mod());
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Введен не верный пункт");
            }



        }

    }


