package com.company.mywebtest;

public class ShowTask {



    public  void start(){
    showMainMenu();
    }



    private void showMainMenu(){
        System.out.println("Select an action. Enter the number 1...5.");
        System.out.println("1. Select the type of rational fraction: A/x-a .");
        System.out.println("2. Select the type of rational fraction: A/(x-a)^n .");
        System.out.println("3. Select the type of rational fraction: M*x+N/x^2+px+q .");
        System.out.println("4. Select the type of rational fraction: M*x+N/(x^2+px+q)^n .");
        System.out.println("5. Stop program");
        System.out.println("------------------------------");

    }




}
