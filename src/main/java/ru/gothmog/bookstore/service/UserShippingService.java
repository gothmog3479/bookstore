package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.UserShipping;

/**
 * @author d.grushetskiy
 */
public interface UserShippingService {
    UserShipping findById(Long id);

    void removeById(Long id);
}
