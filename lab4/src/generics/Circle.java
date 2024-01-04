package generics;

public class Circle extends Shape{
    private final Double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle (Double _radius){
        radius = _radius;
    }

    @Override
    public void draw() {
        System.out.print("Circle rad(" + radius + ")");
    }
}
