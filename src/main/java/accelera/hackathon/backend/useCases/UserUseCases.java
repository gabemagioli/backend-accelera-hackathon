package accelera.hackathon.backend.useCases;

import accelera.hackathon.backend.repositories.DoctorRepository;
import accelera.hackathon.backend.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserUseCases {

    @Autowired
    private UsersRepository UserRepository;
    @Autowired
    private DoctorRepository doctorRepository;


}
