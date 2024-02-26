package by.javastart.stepik_course_88260.service;

import by.javastart.stepik_course_88260.model.User;
import by.javastart.stepik_course_88260.repository.UserRepository;

public interface UserService {
    User save(User user);
}

