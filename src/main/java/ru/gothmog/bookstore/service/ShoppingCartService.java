package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.ShoppingCart;

/**
 * @author d.grushetskiy
 */
public interface ShoppingCartService {
    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);
}
