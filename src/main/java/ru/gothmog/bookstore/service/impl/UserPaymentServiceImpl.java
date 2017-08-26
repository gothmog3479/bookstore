package ru.gothmog.bookstore.service.impl;

import org.springframework.stereotype.Service;
import ru.gothmog.bookstore.domain.UserPayment;
import ru.gothmog.bookstore.repository.UserPaymentRepository;
import ru.gothmog.bookstore.service.UserPaymentService;

/**
 * @author gothmog on 26.08.2017.
 */
@Service
public class UserPaymentServiceImpl implements UserPaymentService{

    private UserPaymentRepository userPaymentRepository;
    @Override
    public UserPayment findById(Long id) {
        return userPaymentRepository.findOne(id);
    }

    @Override
    public void removeById(Long id) {
        userPaymentRepository.delete(id);
    }
}
