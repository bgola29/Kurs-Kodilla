package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer , ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getNumberOfPost() > 0)
                .collect(Collectors.toMap(ForumUser::getUniqueUserIdentifier , forumUser -> forumUser));

        System.out.println("User List : " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
