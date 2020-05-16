package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumComment {
    ForumPost forumPost;
    String comentBody;
    String author;

    public ForumComment(ForumPost forumPost, String comentBody, String author) {
        this.forumPost = forumPost;
        this.comentBody = comentBody;
        this.author = author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getComentBody() {
        return comentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment)) return false;
        ForumComment that = (ForumComment) o;
        return getForumPost().equals(that.getForumPost()) &&
                getComentBody().equals(that.getComentBody()) &&
                getAuthor().equals(that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getForumPost(), getComentBody(), getAuthor());
    }

    public String getCommentBody() {
        return null;
    }
}
