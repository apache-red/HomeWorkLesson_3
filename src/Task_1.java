import java.util.ArrayList;

public class Task_1 {


    ArrayList<Circle> listCircle = new ArrayList<>();
    int[][] mass = new int[50][50];

    ShowTask showTask = new ShowTask();
    WriteTask writeTask = new WriteTask();
    RationalFraction rationalFraction = new RationalFraction();

    public void start() {
        showTask.start();
        choseAction(writeTask.writeAction());

    }

    private void choseAction(int number) {
        switch (number) {
            case 1:
                System.out.println("Enter number A, x, a");
                System.out.println("--------------------------");
                rationalFraction.createRationalFraction_1(writeTask.writeNumbers(), writeTask.writeNumbers(),
                        writeTask.writeNumbers());
                System.out.println("The center of the circle is created from the obtained X, Y values.");
                System.out.println("--------------------------");
                System.out.println("Set the radius of the circle");
                saveCircle(new Circle(rationalFraction.getX(), rationalFraction.getY(), writeTask.writeNumbers()));
                System.out.println("The figure is added");

                break;
            case 2:
                System.out.println("Enter number A, x, a, n");
                System.out.println("--------------------------");
                rationalFraction.createRationalFraction_2(writeTask.writeNumbers(), writeTask.writeNumbers(),
                        writeTask.writeNumbers(), (int) writeTask.writeNumbers());
                System.out.println("The center of the circle is created from the obtained X, Y values.");
                System.out.println("--------------------------");
                System.out.println("Set the radius of the circle");
                saveCircle(new Circle(rationalFraction.getX(), rationalFraction.getY(), writeTask.writeNumbers()));
                System.out.println("The figure is added");
                System.out.println("The figure is added");
                break;
            case 3:
                System.out.println("Enter number M, x, N, p, q");
                System.out.println("--------------------------");
                rationalFraction.createRationalFraction_3(writeTask.writeNumbers(), writeTask.writeNumbers(),
                        writeTask.writeNumbers(), writeTask.writeNumbers(), writeTask.writeNumbers());
                System.out.println("The center of the circle is created from the obtained X, Y values.");
                System.out.println("--------------------------");
                System.out.println("Set the radius of the circle");
                saveCircle(new Circle(rationalFraction.getX(), rationalFraction.getY(), writeTask.writeNumbers()));
                System.out.println("The figure is added");
                System.out.println("The figure is added");
                break;
            case 4:
                System.out.println("Enter number M, x, N, p, q, n");
                System.out.println("--------------------------");
                rationalFraction.createRationalFraction_4(writeTask.writeNumbers(), writeTask.writeNumbers(),
                        writeTask.writeNumbers(), writeTask.writeNumbers(), writeTask.writeNumbers(), (int) writeTask.writeNumbers());
                System.out.println("The center of the circle is created from the obtained X, Y values.");
                System.out.println("--------------------------");
                System.out.println("Set the radius of the circle");
                saveCircle(new Circle(rationalFraction.getX(), rationalFraction.getY(), writeTask.writeNumbers()));
                System.out.println("The figure is added");
                System.out.println("The figure is added");
                break;
            case 5:
                System.out.println("Draw all added shapes");
                createPlate();
                showPlate();
                break;
            case 6:
                System.out.println("Added data:");
                getAllData();
                break;
            case 7:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        start();
    }

    private void createPlate() {
        int pointX = 0;
        int pointY = 0;
        int cor = 25;

        for (int i = 0; i < listCircle.size(); i++) {

            pointX = (int) listCircle.get(i).getX();
            pointY = (int) listCircle.get(i).getY();

            if (pointX < 24 && pointY < 24) {

                if (pointX > 0 && pointY < 0) {
                    mass[cor - pointY][pointX + cor] = i + 1;

                }
                if (pointX > 0 && pointY > 0) {
                    mass[cor + pointY][pointX + cor] = i + 1;

                }
                if (pointX < 0 && pointY > 0) {
                    mass[cor + pointY][cor - pointX] = i + 1;
                }
                if (pointX < 0 && pointY < 0) {
                    mass[cor - pointY][cor - pointX] = i + 1;
                }

            } else {
                System.out.println("output out of schedule > +-50");
            }
        }
    }


    public void showPlate() {

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i != 25) {
                    System.out.print(mass[i][j] + " ");
                }
                if (i == 25) {
                    System.out.print("_ ");
                }
                if (j == 25) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }

    private void saveCircle(Circle circle) {
        listCircle.add(circle);
    }


    private void getAllData(){


        for (int i = 0; i <listCircle.size() ; i++) {
            System.out.println("----");
            System.out.println("Circle "+ i);
            System.out.println("X ="+listCircle.get(i).getX());
            System.out.println("Y ="+listCircle.get(i).getY());
            System.out.println("Radius ="+listCircle.get(i).getR());
            System.out.println("Area ="+listCircle.get(i).getS());
            System.out.println("Perimetr ="+listCircle.get(i).getP());

        }

    }

    private void  smallestAndLargestObj(){

        for (int i = 0; i < listCircle.size() ; i++) {



        }

    }



}
