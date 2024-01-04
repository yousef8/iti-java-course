package mycomplex;

public interface MyComplex<T extends Number> {
  MyComplex<T> add(MyComplex<T> otherComplex);

  MyComplex<T> sub(MyComplex<T> otherComplex);


  MyComplex<T> multiply(MyComplex<T> otherComplex);

  MyComplex<T> divide(MyComplex<T> otherComplex);

  void setReal(T _real);

  void setImg(T _img);

  T getReal();

  T getImg();


}
