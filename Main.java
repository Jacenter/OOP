package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle defaultrect = new Rectangle();
        System.out.println(defaultrect);
        defaultrect.calcArea();

        Rectangle rect1 = new Rectangle("blue",60,20);
        System.out.println(rect1);
        rect1.calcArea();


        Triangle t1 = new Triangle("Greg","Green",5.0,6.0);
        t1.calculatePerim();
        t1.calculateArea();

        t1.setSide(7.0);
        t1.setBase(2.0);
        t1.setName("Joe");
        t1.setColor("White");
        System.out.println(t1.getBase());
        System.out.println(t1.getSide());
        System.out.println(t1.getName());
        System.out.println(t1.getColor());

        Circle c1 = new Circle("green","bob",5);
        c1.calculateArea();
        c1.calculateCircumfrance();

        c1.setName("joe");
        c1.setColor("blue");
        c1.setRadius(7);
        System.out.println(c1.getName());
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());


    }
}
