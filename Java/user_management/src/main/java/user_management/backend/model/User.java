package user_management.backend.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String userName;
    private String email;
    private String password;
}
