package by.javastart.stepik_course_88260.service;

import by.javastart.stepik_course_88260.model.User;
import by.javastart.stepik_course_88260.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }
}
