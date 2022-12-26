package interface_demo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Rectangle implements iShape, IOther {
    private double width;
    private double height;

    @Override
    public double getArea(){
        return this.width * this.height;
    }

    @Override
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    @Override
    public void sayHello(){
        System.out.println("i am rectangle");
    }

    @Override
    public void show() {
        System.out.println(this);
    }
}
