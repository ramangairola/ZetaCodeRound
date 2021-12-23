import java.util.List;

public class Square extends Shape {
    List<Integer> dimensions;
    String color;

    public Square(List<Integer> dimensions, String color) {
        super(dimensions, color);
    }

    public double calc(List<Integer> dimensions){
        return dimensions.get(0) * dimensions.get(0);
    }

}
