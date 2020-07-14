package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser("Ania Zawada", 3, 'F', 2010, 10, 2, 2));
        forumUserList.add(new ForumUser("Kasia Cukierek", 5, 'F', 1915, 10, 1, 0));
        forumUserList.add(new ForumUser("Michał Starych", 2, 'M', 1922, 11, 2, 15));
        forumUserList.add(new ForumUser("Basia Gigant", 13, 'F', 2012, 5, 5, 2));
        forumUserList.add(new ForumUser("Michał Szalony", 12, 'M', 2002, 2, 5, 11));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
