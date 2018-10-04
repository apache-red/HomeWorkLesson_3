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




}
