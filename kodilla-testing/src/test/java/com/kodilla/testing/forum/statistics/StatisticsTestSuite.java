package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.CalculateStatistics;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWhenPost0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics1 = new CalculateStatistics();
        List<String> userName = new LinkedList<>();
        userName.add("bartek");
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.commentsCount()).thenReturn(3);
        //When
        calculateStatistics1.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateStatistics1.getAverageNumberOfPostPerUser(), 0.00001);
        assertEquals(0, calculateStatistics1.getAverageNumberOfCommentsPerPost(), 0.0001);
    }


    @Test
    public void testCalcuateAdvStatisticsWhenPost1000() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(genereteListOfUsers(1));
        when(statisticsMock.commentsCount()).thenReturn(1);

        //When

        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.0001);
        assertEquals(1000, calculateStatistics.getAverageNumberOfPostPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenComments0() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = new LinkedList<>();
        userName.add("bartek");
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.usersNames()).thenReturn(userName);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(8, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.0001);
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost() , 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsLessThenPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.usersNames()).thenReturn(genereteListOfUsers(1));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost() , 0.00001);
        assertEquals(3, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.00001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsMoreThenPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(25);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.usersNames()).thenReturn(genereteListOfUsers(1));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, calculateStatistics.getAverageNumberOfCommentsPerPost() , 0.0001);
        assertEquals(25, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(genereteListOfUsers(100));
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, calculateStatistics.getAverageNumberOfPostPerUser(), 0.0001);
    }


    private List<String> genereteListOfUsers(int n) {
        List<String> users = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            users.add("Piotrek" + i);
        }
        return users;
    }
}



