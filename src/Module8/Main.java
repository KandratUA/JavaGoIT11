package Module8;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {
                new Circle(5, 50, 15, "Blue"),
                new Square(10, 10, 5, "White"),
                new Triangle(3, 3 ,3, 4, 3, "Red"),
                new Rectangle(4, 5, 25,10,"Orange"),
                new Pentagon(1,1,1,2,2,3,3,2,3,1, "Green")
        };

        for(Shape shp : shapes)
            System.out.println(shp.getName() + ": area = " + shp.getArea() + ", color: " + shp.color);
    }
}
