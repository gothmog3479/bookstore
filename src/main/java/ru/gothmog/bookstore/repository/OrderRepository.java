package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.Order;

/**
 * @author d.grushetskiy
 */
public interface OrderRepository extends CrudRepository<Order, Long>{
}
