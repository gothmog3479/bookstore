package ru.gothmog.bookstore.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gothmog.bookstore.domain.User;
import ru.gothmog.bookstore.domain.security.PasswordResetToken;
import ru.gothmog.bookstore.domain.security.UserRole;
import ru.gothmog.bookstore.repository.PasswordResetTokenRepository;
import ru.gothmog.bookstore.repository.RoleRepository;
import ru.gothmog.bookstore.repository.UserRepository;
import ru.gothmog.bookstore.service.UserService;

import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService{

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordResetTokenRepository passwordResetTokenRepository;

    @Override
    public PasswordResetToken getPasswordResetToken(final String token) {
        return passwordResetTokenRepository.findByToken(token);
    }

    @Override
    //@Transactional
    public void createPasswordResetTokenForUser(final User user, final String token) {
        PasswordResetToken myToken = new PasswordResetToken(token ,  user );
        passwordResetTokenRepository.save(myToken);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    @Transactional
    public User createUser(User user, Set<UserRole> userRoles){
        User localUser = userRepository.findByUsername(user.getUsername());

        if (localUser != null){
            LOG.info("user {*} already exists. Nothing will be done", user.getUsername());
        } else {
            for (UserRole userRole : userRoles){
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);

            localUser = userRepository.save(user);
        }
        return localUser;
    }
}
