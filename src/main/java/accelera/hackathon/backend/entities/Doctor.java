package accelera.hackathon.backend.entities;

import accelera.hackathon.backend.enums.roles.UserRoles;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("DOCTORS")
public class Doctor extends User{
    @Column
    private String crm;

    public Doctor(String name, String email, String cpf, String password, UserRoles role, String crm) {
        super(name, email, cpf, password, role);
        this.crm = crm;
    }
}
