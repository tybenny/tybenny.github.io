package upcasting_demo;

import javax.swing.text.Style;

public class Test {
    public static void main(String[] args) {
        //upcasting
        Person p = new Student("so");

        //nếu method được override -> goi đến method đã override
        //nếu method ko dc override -> gọi đến method của lớp cha
        p.eat();
        p.sleep();
        p.work();
        ((Student) p).display();

        System.out.println();

        //downcasting
        Student student = (Student) p;
        student.display();
        student.eat();
        student.sleep();
        student.work();
    }
}

