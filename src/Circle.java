public class Circle {


    private double X;
    private double Y;
    private double R;
    private double S;
    private double P;

    public double getP() {
        return P;
    }

    public void setP(double p) {
        P = p;
    }

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public Circle(double x, double y, double r) {
        X = x;
        Y = y;
        R = r;
        solutionRad();
        solutionPerim();
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getR() {
        return R;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public void setR(double r) {
        R = r;
    }

   private void solutionRad() {
        S = Math.PI * (Math.pow(R, 2));
    }

    private void solutionPerim() {
        P = 2 * Math.PI * R;
    }


}