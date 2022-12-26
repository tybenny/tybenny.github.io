package team_management.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Player {
    private int number;
    private String name;
    private Position position;
}