package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.User;
import ru.gothmog.bookstore.domain.UserBilling;
import ru.gothmog.bookstore.domain.UserPayment;
import ru.gothmog.bookstore.domain.UserShipping;
import ru.gothmog.bookstore.domain.security.PasswordResetToken;
import ru.gothmog.bookstore.domain.security.UserRole;

import java.util.Set;

/**
 * @author d.grushetskiy
 */
public interface UserService{
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail(String email);

    User findById (Long id);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}
