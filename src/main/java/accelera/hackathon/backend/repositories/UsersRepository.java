package accelera.hackathon.backend.repositories;

import accelera.hackathon.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, String> {
}
