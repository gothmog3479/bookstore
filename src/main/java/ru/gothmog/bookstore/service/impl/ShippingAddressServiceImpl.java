package ru.gothmog.bookstore.service.impl;

import org.springframework.stereotype.Service;
import ru.gothmog.bookstore.domain.ShippingAddress;
import ru.gothmog.bookstore.domain.UserShipping;
import ru.gothmog.bookstore.service.ShippingAddressService;

/**
 * @author gothmog on 26.08.2017.
 */
@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {
    @Override
    public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress) {
        shippingAddress.setShippingAddressName(userShipping.getUserShippingName());
        shippingAddress.setShippingAddressStreet1(userShipping.getUserShippingStreet1());
        shippingAddress.setShippingAddressStreet2(userShipping.getUserShippingStreet2());
        shippingAddress.setShippingAddressCity(userShipping.getUserShippingCity());
        shippingAddress.setShippingAddressState(userShipping.getUserShippingState());
        shippingAddress.setShippingAddressCountry(userShipping.getUserShippingCountry());
        shippingAddress.setShippingAddressZipcode(userShipping.getUserShippingZipcode());
        return shippingAddress;
    }
}
