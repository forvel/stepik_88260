package by.javastart.stepik_course_88260.repository;

import by.javastart.stepik_course_88260.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
