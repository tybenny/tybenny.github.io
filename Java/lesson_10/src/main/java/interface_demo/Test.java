package interface_demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        iShape shape = new Rectangle(4,5);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        iShape shape1 = new Square(12);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());

        ArrayList <iShape> shapes = new ArrayList<>();
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(new Rectangle(4,3));
        shapes.add(new Square(7));

        System.out.println("Danh sach cac hinh:");
        for (iShape s: shapes
             ) {
            System.out.println(s.getArea());
            System.out.println(s.getPerimeter());
        }

        //in ra thong tin hinh vuong
        System.out.println("Danh sach cac hinh vuong:");
        for (iShape s: shapes
        ) {
            if (s instanceof Square){
                System.out.println(s);
                System.out.println(s.getArea());
                System.out.println(s.getPerimeter());
            }
        }

        System.out.println(iShape.message);

        shape.sayHello();
        shape1.sayHello();

        iShape.hi();
    }
}
