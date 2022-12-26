package interface_demo;

public interface iShape {
    String message = "shape"; //public, static, final
    double getArea();
    double getPerimeter();

    default void sayHello(){
        System.out.println("say hello");
    }

    static void hi(){
        System.out.println("hi");
    }
}
