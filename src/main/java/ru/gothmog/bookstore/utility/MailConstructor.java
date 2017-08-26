package ru.gothmog.bookstore.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import ru.gothmog.bookstore.domain.User;

import java.util.Locale;

/**
 * @author gothmog on 26.08.2017.
 */
@Component
public class MailConstructor {
    @Autowired
    private Environment environment;
    @Autowired
    private TemplateEngine templateEngine;

    public SimpleMailMessage constructResetTokenEmail(String contextPath, Locale locale, String token, User user, String password){
        return null;
    }
}
