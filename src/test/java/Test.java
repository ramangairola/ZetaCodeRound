import java.util.ArrayList;
import java.util.List;

public class Test {

    Shape shape;

    @org.testng.annotations.Test
    public void checkMathFunc(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(3);
        shape = new Circle(li, "Red");
        System.out.println(shape.calc(li));
        shape = new Square(li, "Pink");
        System.out.println(shape.calc(li));
        li.add(5);
        shape = new Rectangle(li, "White");
        System.out.println(shape.calc(li));
    }

}
