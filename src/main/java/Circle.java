import java.util.List;

public class Circle extends Shape {
    List<Integer> dimensions;
    String color;

    public Circle(List<Integer> dimensions, String color) {
        super(dimensions, color);
    }

    public double calc(List<Integer> dimensions){
        return 3.14 * dimensions.get(0);
    }

}
