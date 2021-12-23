import java.util.List;

public class Shape {
    List<Integer> dimensions;
    String color;

    public Shape(List<Integer> dimensions, String color){
        this.dimensions = dimensions;
        this.color = color;
    }

    public double calc(List<Integer> dimensions){
        double result = 1;
        if(dimensions.size() == 2){
            result =  dimensions.get(0) * dimensions.get(1);
        }else if(dimensions.size() == 3){
            result =  dimensions.get(0) * dimensions.get(1) * dimensions.get(2);
        }
        return result;
    }
}
