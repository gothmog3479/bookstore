package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.ShippingAddress;
import ru.gothmog.bookstore.domain.UserShipping;

/**
 * @author d.grushetskiy
 */
public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
