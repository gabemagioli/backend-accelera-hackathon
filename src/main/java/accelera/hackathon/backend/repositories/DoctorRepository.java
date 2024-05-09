package accelera.hackathon.backend.repositories;

import accelera.hackathon.backend.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
