package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.gothmog.bookstore.domain.CartItem;
import ru.gothmog.bookstore.domain.Order;
import ru.gothmog.bookstore.domain.ShoppingCart;

import java.util.List;

/**
 * @author d.grushetskiy
 */
@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    List<CartItem> findByOrder(Order order);
}
