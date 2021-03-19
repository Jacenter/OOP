package shapes;

public class Circle {

    //variables
    private String color;
    private String name;
    private int radius;

    public Circle(String color, String name, int radius){
        this.color = color;
        this.name = name;
        this.radius = radius;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void calculateCircumfrance(){
        int c = (int) (Math.PI * (radius * radius));
        System.out.println("The circumfrance of this circle is " + c);
    }

    public void calculateArea(){
        int r = (int) (radius*radius*Math.PI);
        System.out.println("The area of the circle is " + r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                '}';
    }
}
