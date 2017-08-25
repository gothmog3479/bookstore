package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.*;

/**
 * @author d.grushetskiy
 */
public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);

    Order findOne(Long id);
}
