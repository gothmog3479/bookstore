package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.UserPayment;

/**
 * @author d.grushetskiy
 */
public interface UserPaymentService {
    UserPayment findById(Long id);

    void removeById(Long id);
}
