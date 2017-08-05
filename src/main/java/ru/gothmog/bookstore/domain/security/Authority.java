package ru.gothmog.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author d.grushetskiy
 */
public class Authority implements GrantedAuthority {
    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
