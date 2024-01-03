import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();

    String email();
}

@Author(name = "yousef class", email = "yousefClass@g.com")
class MyAnno {

    @Author(name = "yousef method", email = "yousefMethod@g.com")
    public void display() {
        System.out.println("Hello World");
    }

    public static void main(String args[])   {
        MyAnno ob = new MyAnno();

        Author anno = ob.getClass().getAnnotation(Author.class);
        System.out.println(anno.name() + " " + anno.email());

        anno = ob.getClass().getMethod("display").getAnnotation(Author.class);
        System.out.println(anno.name() + " " + anno.email());

        return ;
    }
}
