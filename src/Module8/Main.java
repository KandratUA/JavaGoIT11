package Module8;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = {
                new Circle(),
                new Quad(),
                new Triangles(),
                new Rectangle(),
                new Octagon()
        };

        for(Shape shp : shapes)
            System.out.println(shp.getName());
    }
}
