package Student_management.model.Test;

import Student_management.model.model.Student;
import Student_management.model.service.StudentService;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student student = studentService.createStudent();
        studentService.printInfo(student);
    }
}
