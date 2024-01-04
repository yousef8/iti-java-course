package mycomplex;

public class MyComplexDouble implements MyComplex<Double> {
  private Double real;
  private Double img;

  public MyComplexDouble(Double _real, Double _img) {
    real = _real;
    img = _img;
  }

  @Override
  public Double getReal() {
    return real;
  }

  @Override
  public Double getImg() {
    return img;
  }

  @Override
  public void setReal(Double real) {
    this.real = real;
  }

  @Override
  public void setImg(Double img) {
    this.img = img;
  }

  @Override
  public MyComplex<Double> add(MyComplex<Double> otherComplex) {
    Double newReal = getReal() + otherComplex.getReal();
    Double newImg = getImg() + otherComplex.getImg();

    return new MyComplexDouble(newReal, newImg);
  }

  @Override
  public MyComplex<Double> sub(MyComplex<Double> otherComplex) {
    Double newReal = getReal() - otherComplex.getReal();
    Double newImg = getImg() - otherComplex.getImg();

    return new MyComplexDouble(newReal, newImg);
  }

  @Override
  public MyComplex<Double> multiply(MyComplex<Double> otherComplex) {
    Double newReal = getReal() * otherComplex.getReal();
    Double newImg = getImg() * otherComplex.getImg();

    return new MyComplexDouble(newReal, newImg);
  }

  @Override
  public MyComplex<Double> divide(MyComplex<Double> otherComplex) throws ArithmeticException {
    if (otherComplex.getReal() == 0 || otherComplex.getImg() == 0) {
      throw new ArithmeticException("Cann't divide by zero");
    }

    Double newReal = getReal() / otherComplex.getReal();
    Double newImg = getImg() / otherComplex.getImg();

    return new MyComplexDouble(newReal, newImg);
  }

  @Override
  public String toString() {
    String s = String.format("%.2f", getReal());
    if (getImg() >= 0) {
      s += "+";
    }

    s += String.format("%.2f", getImg()) + "i";

    return s;
  }
}