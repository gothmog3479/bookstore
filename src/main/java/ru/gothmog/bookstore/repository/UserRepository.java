package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.User;

/**
 * @author d.grushetskiy
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}
