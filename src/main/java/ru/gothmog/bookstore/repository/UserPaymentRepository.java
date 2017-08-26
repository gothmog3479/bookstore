package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.UserPayment;

/**
 * @author d.grushetskiy
 */
public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {
}
