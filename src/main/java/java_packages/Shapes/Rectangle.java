package java_packages.Shapes;

public class Rectangle implements Shape {

    private  int width, height;

    protected Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
       int res = this.width*this.height;
        System.out.println("The area of the rectangle ="+res);
    }

    @Override
    public void perimeter() {
        int res = 2*(this.width+this.height);
        System.out.println("The perimeter of the rectangle ="+res);
    }
}
