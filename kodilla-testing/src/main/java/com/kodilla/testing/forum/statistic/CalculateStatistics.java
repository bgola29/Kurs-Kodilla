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
        if (numberOfComments == 0) {
            System.out.println("Wartosc nieprawidlowa");
        }else { getAverageNumberOfPostPerUser();}

        if (averageNumberOfCommentsPerUser == 0) {
            System.out.println("Wartosc nieprawidłowa");
        }else{}
        if (averageNumberOfPostPerUser == 0) {
            System.out.println("Wartosc nieprawidlowa");
        }else {}


        averageNumberOfPostPerUser = statistics.postsCount() / numberOfUser;
        averageNumberOfCommentsPerUser = statistics.commentsCount() / numberOfUser;
        averageNumberOfCommentsPerPost = statistics.commentsCount() / statistics.postsCount();

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
