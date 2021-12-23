import java.util.List;

public class Rectangle extends Shape {
    List<Integer> dimensions;
    String color;

    public Rectangle(List<Integer> dimensions, String color) {
        super(dimensions, color);
    }

    public double calc(List<Integer> dimensions){
        return dimensions.get(0) * dimensions.get(1);
    }

}
