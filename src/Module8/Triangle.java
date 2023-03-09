package Module8;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int x1, int y1, double sideA, double sideB, double sideC, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }
    private static final String Name = "Triangles";

    @Override
    public String getName() {
        return Name;
    }
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}