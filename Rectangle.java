package shapes;

public class Rectangle {

    //variables
    public String color;
    public int w;
    public int h;
    private String name;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    // constructor
    public Rectangle(String color, int w, int h){
        this.color = color; //gives us the color we pass in
        this.w = w;
        this.h = h; //gives us the assigned h that we pass in
    }

    //overload constructor
    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }

    public Rectangle(){
        this (75,75); //invokes the overloaded constructor
    }


    //method
    public void calcArea(){
        System.out.println(this.w * this.h);

    }

    public static void addObject(String color, int xAxis, int yAxis){
        System.out.println("Added a " + color + " Rectangle to position " + xAxis + " on the xAxis and " + yAxis + " on the yAxis" );
    }

    public static void addObject(int x, int y){
        System.out.println("added a rectangle at position" + x + y);
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", w=" + w +
                ", h=" + h +
                '}';
    }
}
