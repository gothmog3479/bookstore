package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.UserPayment;

/**
 * @author gothmog on 06.08.2017.
 */
public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{
}
