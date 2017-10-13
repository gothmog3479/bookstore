package ru.gothmog.bookstore.service;

import ru.gothmog.bookstore.domain.User;
import ru.gothmog.bookstore.domain.security.PasswordResetToken;
import ru.gothmog.bookstore.domain.security.UserRole;

import javax.transaction.Transactional;
import java.util.Set;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail (String email);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
