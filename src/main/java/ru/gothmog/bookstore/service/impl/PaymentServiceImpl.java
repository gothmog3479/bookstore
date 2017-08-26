package ru.gothmog.bookstore.service.impl;

import org.springframework.stereotype.Service;
import ru.gothmog.bookstore.domain.Payment;
import ru.gothmog.bookstore.domain.UserPayment;
import ru.gothmog.bookstore.service.PaymentService;

/**
 * @author gothmog on 26.08.2017.
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Payment setByUserPayment(UserPayment userPayment, Payment payment) {
        payment.setType(userPayment.getType());
        payment.setHolderName(userPayment.getHolderName());
        payment.setCardNumber(userPayment.getCardNumber());
        payment.setExpiryMonth(userPayment.getExpiryMonth());
        payment.setExpiryYear(userPayment.getExpiryYear());
        payment.setCvc(userPayment.getCvc());

        return payment;
    }
}
