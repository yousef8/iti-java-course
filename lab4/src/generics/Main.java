package generics;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Test test = new Test();

    ArrayList<Rectangle> rects = new ArrayList<>();
    rects.add(new Rectangle());
    rects.add(new Rectangle(5.5, 122.0));

    test.display(rects);

    ArrayList<Circle> circs = new ArrayList<>();
    circs.add(new Circle(6.8));
    circs.add(new Circle(23.8));
    circs.add(new Circle(88.0));

    test.display(circs);

    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Shape());
    shapes.add(new Shape());
    shapes.add(new Shape());

    test.display(shapes);

    /*
    ArrayList<Integer> ints = new ArrayList<Integer>();
    ints.add(8);
    ints.add(9);
    ints.add(12);

    test.display(ints);

    */
  }
}

