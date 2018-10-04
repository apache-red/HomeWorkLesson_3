import java.util.ArrayList;
import java.util.List;

public class Task_1 {


    ArrayList<Circle> listCircle = new ArrayList<>();

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
                break;
            case 5:
                System.out.println("Draw all added shapes");
                createPlane();

                break;
            case 6:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        start();
    }


    private void test() {

        int[] x = new int[20];
        double[] y = new double[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
            y[i] = 0.3 / 2.0 * Math.sin(x[i]) + 5;
        }
        new Draw(x, y);
    }

    private void saveCircle(Circle circle) {
        listCircle.add(circle);
    }

//    private void showList() {
//        System.out.println(listCircle.size());
//        System.out.println(listCircle.get(0));
//        System.out.println(listCircle.get(0).getX());
//        System.out.println(listCircle.get(0).getY());
//        System.out.println(listCircle.get(0).getR());
//    }


    public void createPlane() {
        //set size lenght line x , y
        int[] x = new int[30];
        double[] y = new double[20];
        //pass

        new Plane(x, y, listCircle.get(0).getX(), listCircle.get(0).getY(),listCircle.get(0).getX());
    }


}
