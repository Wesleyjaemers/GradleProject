package java_packages.Shapes;

public class Triangle implements Shape {

    private int firstSide, secondSide, base, height;



    protected Triangle (int base, int height, int firstSide, int secondSide){
            this.base = base;
            this.height = height;
            this.firstSide = firstSide;
            this.secondSide = secondSide;
    }
    @Override
    public void area() {
       double res = this.base*this.height/2;
        res = (double)Math.round(res*100d)/100d;
        System.out.println("The area of the triangle ="+res);
    }

    @Override
    public void  perimeter() {
       double res = this.base+ this.firstSide + this.secondSide;
        System.out.println("The perimeter of the triangle ="+res);
    }
}
