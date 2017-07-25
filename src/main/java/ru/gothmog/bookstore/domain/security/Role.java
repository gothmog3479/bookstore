package ru.gothmog.bookstore.domain.security;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author d.grushetskiy
 */
@Entity
public class Role {
    @Id
    private int roleId;
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserRole> userRoles = new HashSet<>();
}
