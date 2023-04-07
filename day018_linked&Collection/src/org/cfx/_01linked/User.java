package org.cfx._01linked;

/**
 * @author RTX 9090
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return name;
    }
}
