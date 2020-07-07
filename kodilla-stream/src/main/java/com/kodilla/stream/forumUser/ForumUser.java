package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final String userName;
    private final int uniqueUserIdentifier;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPost;


    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", uniqueUserIdentifier=" + uniqueUserIdentifier +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPost=" + numberOfPost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUniqueUserIdentifier() == forumUser.getUniqueUserIdentifier() &&
                getSex() == forumUser.getSex() &&
                getNumberOfPost() == forumUser.getNumberOfPost() &&
                getUserName().equals(forumUser.getUserName()) &&
                getDateOfBirth().equals(forumUser.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getUniqueUserIdentifier(), getSex(), getDateOfBirth(), getNumberOfPost());
    }

    public ForumUser(String userName, int uniqueUserIdentifier, char sex, int dayOfBirth, int monthOfBirth, int yearOfBirth, int numberOfPost) {
        this.userName = userName;
        this.uniqueUserIdentifier = uniqueUserIdentifier;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(dayOfBirth , monthOfBirth , yearOfBirth);
        this.numberOfPost = numberOfPost;
    }

    public String getUserName() {
        return userName;
    }

    public int getUniqueUserIdentifier() {
        return uniqueUserIdentifier;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }
}
