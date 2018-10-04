import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Plane extends javax.swing.JFrame{
    private int[] x;
    private double[] y;

    private double X;
    private double Y;
    private double R;

   // private int[] yTrue;
    private Dimension size = new Dimension(1000,700); //рабочая область
    private Dimension startPointXoY = new Dimension(40,650); //начало координат
    private int scale = 30; //масштаб


    public double getXcoordinates() {
        return X;
    }


    public double getYcoordinates() {
        return Y;
    }

    public double getRcoordinates() {
        return R;
    }

    public Plane(int[] x, double[] y, double X, double Y, double R){

        this.x = x;
        this.y = y;
        this.X = X;
        this.Y = Y;
        this.R = R;
        initInterface();

       // yTrue = new int[x.length];
             }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,size.width,size.height);
        g.setColor(Color.WHITE);
        for (int i = 1; i <= x.length; i++) {
            // numbers under line x,y
            g.drawString(String.valueOf(i),startPointXoY.width + (startPointXoY.width - 10) * i,startPointXoY.height + (startPointXoY.width - 25));
            g.drawString(String.valueOf(i),25,startPointXoY.height - (startPointXoY.width - 10) * i);
        }
        //line x
        g.drawLine(startPointXoY.width,startPointXoY.width,startPointXoY.width,startPointXoY.height);
        //line y
        g.drawLine(startPointXoY.width,startPointXoY.height,950,startPointXoY.height);


        g.drawOval(100,100,75,75);
        g.setColor(Color.RED);



      //  g.drawPolyline(x,yTrue,x.length);
    }



    private void initInterface() {
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setSize(size);
        setResizable(false);
        setTitle("График функции");
        setVisible(true);
    }

    private void reBuildArreys() {
        for (int i = 0; i < x.length; i++) {
            x[i] *= scale;
            x[i] += startPointXoY.width;
            y[i] *= scale;
         //   yTrue[i] = startPointXoY.height - ((int) y[i]);
        }
    }

}
