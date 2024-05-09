package accelera.hackathon.backend.entities;

import accelera.hackathon.backend.enums.roles.UserRoles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="USERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String cpf;//login
    @Column
    private String password;
    @Column
    private UserRoles role;

    public User(String name, String email, String cpf, String password, UserRoles role) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.role = role;
    }

}
