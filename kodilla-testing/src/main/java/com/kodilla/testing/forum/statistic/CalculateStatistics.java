package com.kodilla.testing.forum.statistic;

public class CalculateStatistics {
    int numberOfUser;
    int numberOfPost;
    int numberOfComments;
    double averageNumberOfPostPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUser = statistics.usersNames().size();
        numberOfPost = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfPost > 0 && numberOfUser > 0) {
            averageNumberOfPostPerUser = numberOfPost / numberOfUser;
        } else {
            averageNumberOfPostPerUser =0 ;
        }

        if (numberOfComments > 0 && numberOfUser > 0) {
            averageNumberOfCommentsPerUser = numberOfComments / numberOfUser;
        } else {
            averageNumberOfCommentsPerUser = 0 ;
        }

        if (numberOfComments > 0 && numberOfPost > 0) {
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPost;
        } else {
            averageNumberOfCommentsPerPost = 0;
        }
    }


    public int getNumberOfUser() {
        return numberOfUser;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostPerUser() {
        return averageNumberOfPostPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}
