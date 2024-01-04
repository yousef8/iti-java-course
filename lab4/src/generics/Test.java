package generics;

import java.util.List;

public class Test {
    public void display(List<? extends Shape> shapes){
        for(Shape shape : shapes){
            shape.draw();
            System.out.println();
        }
    }
}
