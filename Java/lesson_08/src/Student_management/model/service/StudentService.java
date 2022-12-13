package Student_management.model.service;

import Student_management.model.model.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentService {

    public Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int id = rd.nextInt(100) + 1;
        System.out.print("Nhập vào tên học viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập vào điểm lý thuyết: ");
        double theoryPoint = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập vào điểm thực hành: ");
        double practicePoint = Double.parseDouble(sc.nextLine());

        Student std = new Student(id, name, theoryPoint, practicePoint);
        return std;
    }


    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return  (theoryPoint + practicePoint) / 2;
    }

    public void printInfo (Student s){
        System.out.println("id : " +s.id);
        System.out.println("name : " + s.name);
        System.out.println("theory Point : " + s.theoryPoint);
        System.out.println("Practice Point : " + s.practicePoint);
        System.out.println("Điểm TB: " + calculateAvgPoint(s.theoryPoint, s.practicePoint));
    }


}

