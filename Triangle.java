package shapes;

public class Triangle {

    //variable
    private double side;
    private double base;
    private String name;
    private String color;

    //constructor
    public Triangle(String name, String color, double side, double base){
        this.side = side;
        this.base = base;
        this.name = name;
        this.color = color;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
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

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void calculatePerim(){
        double p = side + base + side;
        System.out.println(p);
    }

    public void calculateArea(){
        double a = side * base / 2;
        System.out.println("The area is " + a);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

    //area of a triangle is 1/2 x base x height







}

