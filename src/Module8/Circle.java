package Module8;

public class Circle extends Shape{

    private double radius;

    public Circle(int x1, int y1, double radius, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.radius = radius;
        this.color = color;

    }

    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    private static final String Name = "Circle";

    @Override
    public String getName() {
        return Name;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
