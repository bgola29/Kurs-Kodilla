package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser("Ania Zawada", 3, 'F', 10, 10, 2002, 2));
        forumUserList.add(new ForumUser("Kasia Cukierek", 5, 'F', 15, 10, 2001, 0));
        forumUserList.add(new ForumUser("Michał Starych", 2, 'M', 22, 11, 1992, 15));
        forumUserList.add(new ForumUser("Basia Gigant", 13, 'F', 12, 05, 1985, 2));
        forumUserList.add(new ForumUser("Michał Szalony", 12, 'M', 2, 02, 1785, 11));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
