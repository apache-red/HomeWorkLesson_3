public class RationalFraction {

    private double X;
    private double Y;

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }


    public void getXandY(double X , double Y){
        this.X = X;
        System.out.println("X="+this.X);
        this.Y = Y;
        System.out.println("Y="+this.Y);
    }

    public  void createRationalFraction_1(double A, double x, double a) {
        System.out.println("Your rational fraction is: "+ A + " / "+x+ " - "+a);
        System.out.println("------------------------------");
        getXandY(x, solutionRationalFraction_1(A, x, a));

    }

    private double solutionRationalFraction_1(double A, double x, double a){
        return A / (x-a);
    }



    public  void createRationalFraction_2(double A, double x, double a, int n) {
        String str = "Your rational fraction is: : "+ A + " / "+"("+x+ " - "+a+")"+"^"+n;
        System.out.println("------------------------------");
        getXandY(x, solutionRationalFraction_2(A, x, a, n));
    }

    private double solutionRationalFraction_2(double A, double x, double a, int n) {
        return A/ (Math.pow((x-a),n));
    }


    public  void   createRationalFraction_3(double M, double x, double N, double p, double q) {

        String str = "Your rational fraction is: : "+ M +"*"+x+"+"+N+ " / "+x+"^"+"2"+p+"*"+x+ "+"+q;
        System.out.println("------------------------------");
        getXandY(x, solutionRationalFraction_3(M, x, N, p, q));


    }

    private double solutionRationalFraction_3(double M, double x, double N, double p, double q) {
        return ((M*x)+N) / ((Math.pow(x,2)) + (p*x)+q);
    }


    public  void createRationalFraction_4(double M, double x, double N, double p, double q, int n) {

        String str = "Your rational fraction is: : "+ M +"*"+x+"+"+N+ " / "+"("+x+"^"+"2"+"+"+p+"*"+x+ "+"+q+")"+"^"+n;
        System.out.println("------------------------------");
        getXandY(x, solutionRationalFraction_4(M, x, N, p, q, n));


    }

    private double solutionRationalFraction_4(double M, double x, double N, double p, double q, int n) {
        return  ((M*x)+N) / (Math.pow(((Math.pow(x,2)) + (p*x)+q),n));
    }





}
