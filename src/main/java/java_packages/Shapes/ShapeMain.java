package java_packages.Shapes;

public class ShapeMain {
    public static void main(String[] args) {


        Shape c = new Circle(12);
        Shape t = new Triangle(6,4,4,4);
        Shape r = new Rectangle(10,20);

        c.area();
        c.perimeter();
        System.out.println("----------------------------");
        t.area();
        t.perimeter();
        System.out.println("----------------------------");
        r.area();
        r.perimeter();
    }


}
