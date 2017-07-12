package org.david.code.mongodb;

import org.springframework.data.annotation.Id;

/**
 * Created by william on 2017/6/19.
 */
public class Customer {

    @Id
    private String id;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Customer() {
    }

    public Customer(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format(
                "users[id=%s, username='%s']",
                id, username);
    }

}
