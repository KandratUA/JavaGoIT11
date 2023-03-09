package Module8;

public class Rectangle extends Shape{


    private static final String Name = "Rectangle";
    private double width;
    private double height;

    public Rectangle(int x1, int y1, double width, double height, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return Name;
    }


}