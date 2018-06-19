package java_packages.Shapes;

public class Circle implements Shape {

    private int radius;
    private double res;

    protected Circle (int radius){
        this.radius = radius;
    }


    @Override
    public void area() {
        res = Math.PI*(Math.pow(this.radius, 2));
        res = (double)Math.round(res*100d)/100d;
        System.out.println("The area of the circle ="+res);

    }

    @Override
    public void perimeter() {
        res = 2*Math.PI*this.radius;
        res = (double)Math.round(res*100d)/100d;
        System.out.println("The perimeter of the circle ="+res);

    }
}
