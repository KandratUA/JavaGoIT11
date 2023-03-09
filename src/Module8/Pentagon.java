package Module8;

public class Pentagon extends Shape{


    private static final String Name = "Pentagon";
    public Pentagon(int x1, int y1,
                    int x2, int y2,
                    int x3, int y3,
                    int x4, int y4,
                    int x5, int y5,
                    String color){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.x5 = x5;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
        this.y5 = y5;
        this.color = color;
    }
    @Override
    public double getArea() {
        return Math.abs(x1*y2+x2*y3+x3*y4+x4*y5-x5*y4-x4*y3-x3*y2-x2*y1)/2;
    }

    @Override
    public String getName() {
        return Name;
    }
}