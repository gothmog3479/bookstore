package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import ru.gothmog.bookstore.domain.ShoppingCart;

/**
 * @author d.grushetskiy
 */
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
}
