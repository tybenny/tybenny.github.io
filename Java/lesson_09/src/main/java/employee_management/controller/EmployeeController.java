package employee_management.controller;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class EmployeeController {
    private int id;
    private String name;
    private String email;
    private int salary;

}
