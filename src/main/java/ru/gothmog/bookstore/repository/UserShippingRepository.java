package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.UserShipping;

/**
 * @author d.grushetskiy
 */
public interface UserShippingRepository extends CrudRepository<UserShipping, Long>{
}
