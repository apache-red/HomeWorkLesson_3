package com.company.mywebtest;

public class Task_1 {

ShowTask showTask = new ShowTask();
WriteTask writeTask = new WriteTask();
RationalFraction rationalFraction = new RationalFraction();



    public  void start(){
    showTask.start();
    choseAction(writeTask.writeAction());

    }










    private void choseAction(int number){
        switch(number) {
            case 1:
                System.out.println("Enter number A, x, a");
                System.out.println("--------------------------");
                rationalFraction.createRationalFraction_1(writeTask.writeNumbers(), writeTask.writeNumbers(),
                         writeTask.writeNumbers());
                break;
            case 2:
                System.out.println("Enter number A, x, a, n");
                System.out.println("--------------------------");
         //       System.out.println(rationalFraction.createRationalFraction_2(writeTask.writeNumbers(), writeTask.writeNumbers(),
          //              writeTask.writeNumbers(), (int)writeTask.writeNumbers()));
                break;
            case 3:
                System.out.println("Enter number M, x, N, p, q");
                System.out.println("--------------------------");
         //       System.out.println(rationalFraction.createRationalFraction_3(writeTask.writeNumbers(), writeTask.writeNumbers(),
        //                writeTask.writeNumbers(), writeTask.writeNumbers(),writeTask.writeNumbers()));
                break;
            case 4:
                System.out.println("Enter number M, x, N, p, q, n");
                System.out.println("--------------------------");
           //     System.out.println(rationalFraction.createRationalFraction_4(writeTask.writeNumbers(), writeTask.writeNumbers(),
         //               writeTask.writeNumbers(), writeTask.writeNumbers(),writeTask.writeNumbers(),(int)writeTask.writeNumbers()));
                break;
            case 5:
                System.out.println("Program was stopped");
                System.exit(0);
        }
         start();
    }

}
