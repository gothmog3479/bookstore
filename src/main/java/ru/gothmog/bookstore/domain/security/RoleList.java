package ru.gothmog.bookstore.domain.security;

public enum RoleList {

    ROLE_ADMIN("Администратор системы"),
    ROLE_USER("Пользователь системы");

    private String name;

    RoleList(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
