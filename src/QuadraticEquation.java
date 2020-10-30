public class QuadraticEquation {
    public double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant() {
        double delta = Math.pow(b,2) - 4*a*c;
        return delta;
    }
    public double getRoot1() {
        double root1 = (-b + Math.sqrt(getDiscriminant()))/2*a;
        return root1;
    }
    public double getRoot2() {
        double root2 = (-b - Math.sqrt(getDiscriminant()))/2*a;
        return root2;
    }
}
