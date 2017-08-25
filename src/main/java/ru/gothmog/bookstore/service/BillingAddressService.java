package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.BillingAddress;
import ru.gothmog.bookstore.domain.UserBilling;

/**
 * @author d.grushetskiy
 */
public interface BillingAddressService {
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
