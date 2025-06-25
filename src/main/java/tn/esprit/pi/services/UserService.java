package tn.esprit.pi.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pi.user.User;
import tn.esprit.pi.user.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User ajouterUser(User u) {
        return userRepository.save(u);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
