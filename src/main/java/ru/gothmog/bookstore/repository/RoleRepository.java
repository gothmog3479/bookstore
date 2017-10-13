package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gothmog.bookstore.domain.security.Role;

/**
 * @author d.grushetskiy
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByName(String name);
}
