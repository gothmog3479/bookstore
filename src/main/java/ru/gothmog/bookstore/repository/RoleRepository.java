package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.security.Role;

/**
 * @author gothmog on 06.08.2017.
 */
public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByname(String name);
}
