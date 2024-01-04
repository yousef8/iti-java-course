package generics;

public class Rectangle extends Shape {
    private final Double width;
    private final Double height;

    public Rectangle(Double _width, Double _height){
        width = _width;
        height = _height;
    }

    public Rectangle(){
        width = 0.0;
        height = 0.0;
    }

    @Override
    public void draw() {
        System.out.print("Rect: w(" + width + ")    h(" + height + ")");
    }
}