package ru.gothmog.bookstore.model;

import org.springframework.stereotype.Component;

/**
 * @author d.grushetskiy
 */
@Component
public class Message {
    private String name;

    public Message() {
    }

    public Message(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
