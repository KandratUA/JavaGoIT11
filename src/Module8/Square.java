package Module8;

public class Square extends Shape{


    private static final String Name = "Square";

    private double side;
    public Square(int x1, int y1, double side, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * 2;
    }

    @Override
    public String getName() {
        return Name;
    }

}
