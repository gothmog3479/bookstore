package ru.gothmog.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gothmog.bookstore.domain.UserShipping;
import ru.gothmog.bookstore.repository.UserShippingRepository;
import ru.gothmog.bookstore.service.UserShippingService;

/**
 * @author gothmog on 26.08.2017.
 */
@Service
public class UserShippingServiceImpl implements UserShippingService {
    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long id) {
        return userShippingRepository.findOne(id);
    }

    @Override
    public void removeById(Long id) {
        userShippingRepository.delete(id);
    }
}
