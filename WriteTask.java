package com.company.mywebtest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteTask {




    public int writeAction(){
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        try {
            number = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("!Exeption! Enter a number");
            writeAction();
        }
        return number;
    }

    public double writeNumbers(){
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        double number = 5;
        try {
            number = scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("!Exeption! Enter a number");
            writeNumbers();
        }
        return number;
    }

    private void choseAction(int number){
        switch(number) {
            case 1:
                System.out.println("Enter number A, x, a");
                System.out.println("--------------------------");
              //  System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
                break;
            case 2:
                System.out.println("Enter number A, x, a, n");
                System.out.println("--------------------------");
              //  System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction(), writeAction()));
                break;
            case 3:
                System.out.println("Enter number A * B");
                System.out.println("--------------------------");
             //   System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
                break;
            case 4:
                System.out.println("Enter number A / B");
                System.out.println("--------------------------");
             //   System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
                break;
            case 5:
                System.out.println("Program was stopped");
                System.exit(0);
        }
       // start();
    }


}
