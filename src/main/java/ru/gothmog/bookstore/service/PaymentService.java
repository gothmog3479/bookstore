package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.Payment;
import ru.gothmog.bookstore.domain.UserPayment;

/**
 * @author d.grushetskiy
 */
public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
