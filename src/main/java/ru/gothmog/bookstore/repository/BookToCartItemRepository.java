package ru.gothmog.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.gothmog.bookstore.domain.BookToCartItem;
import ru.gothmog.bookstore.domain.CartItem;

/**
 * @author gothmog on 06.08.2017.
 */
@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long>{

    void deleteByCartItem(CartItem cartItem);
}
