import java.util.InputMismatchException;
import java.util.Scanner;


public class RationalFraction {
	
	public void start() {
		showMainMenu();
		choseAction(writeAction());
		writeNumbers();
		
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
		
	
    private int writeAction(){
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
    
    private double writeNumbers(){
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
	
	
	private  String createRationalFraction_1(double A, double x, double a) {
		
		String str = "Решаемое уравнение имеет вид: "+ A + " / "+x+ " - "+a;
		System.out.println("------------------------------");
		solutionRationalFraction_1(A, x, a);
		
		return str;			
	}
	
	private void solutionRationalFraction_1(double A, double x, double a){
		
	}
	
	

	private  String createRationalFraction_1(double A, double x, double a, int n) {
		
		String str = "Решаемое уравнение имеет вид: "+ A + " / "+"("+x+ " - "+a+")"+"^"+n;
		System.out.println("------------------------------");
		solutionRationalFraction_1(A, x, a);
		
		return str;			
	}
	
	private void  createRationalFraction_2() {
		
		
	}
	private void  createRationalFraction_3() {
		
		
	}
	private void  createRationalFraction_4() {
		
		
	}

	
	 private void choseAction(int number){
	        switch(number) {
	            case 1:
	                System.out.println("Enter number A, x, a");
	                System.out.println("--------------------------");
	                System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
	                break;
	            case 2:
	                System.out.println("Enter number A, x, a, n");
	                System.out.println("--------------------------");
	                System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction(), writeAction()));
	                break;
	            case 3:
	                System.out.println("Enter number A * B");
	                System.out.println("--------------------------");
	                System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
	                break;
	            case 4:
	                System.out.println("Enter number A / B");
	                System.out.println("--------------------------");
	                System.out.println(createRationalFraction_1(writeAction(), writeAction(), writeAction()));
	                break;
	            case 5:
	                System.out.println("Program was stopped");
	                System.exit(0);
	        }
	        start();
	    }
	
	
	
	
	
	
}
