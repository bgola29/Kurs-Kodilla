package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class User {
    public String name;
    public String surName;

    public User(final String name, final String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                surName.equals(user.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }


}
