package com.company.mywebtest;

public class RationalFraction {

    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }




    public  double createRationalFraction_1(double A, double x, double a) {
        System.out.println("Your rational fraction is: "+ A + " / "+x+ " - "+a);
        System.out.println("------------------------------");
        return y = solutionRationalFraction_1(A, x, a);
    }

    private double solutionRationalFraction_1(double A, double x, double a){
        return A / (x-a);
    }



    public  void createRationalFraction_2(double A, double x, double a, int n) {

        String str = "Your rational fraction is: : "+ A + " / "+"("+x+ " - "+a+")"+"^"+n;
        System.out.println("------------------------------");
        solutionRationalFraction_2(A, x, a, n);


    }

    private void solutionRationalFraction_2(double A, double x, double a1, int n) {
    }


    public  void  createRationalFraction_3(double M, double x, double N, double p, double q) {

        String str = "Your rational fraction is: : "+ M +"*"+x+"+"+N+ " / "+x+"^"+"2"+p+"*"+x+ "+"+q;
        System.out.println("------------------------------");
        solutionRationalFraction_3(M, x, N, p, q);


    }

    private void solutionRationalFraction_3(double M, double x, double N, double p, double q) {
    }


    public  void  createRationalFraction_4(double M, double x, double N, double p, double q, int n) {

        String str = "Your rational fraction is: : "+ M +"*"+x+"+"+N+ " / "+"("+x+"^"+"2"+"+"+p+"*"+x+ "+"+q+")"+"^"+n;
        System.out.println("------------------------------");
        solutionRationalFraction_4(M, x, N, p, q, n);


    }

    private void solutionRationalFraction_4(double M, double x, double N, double p, double q, int n) {

    }


}
