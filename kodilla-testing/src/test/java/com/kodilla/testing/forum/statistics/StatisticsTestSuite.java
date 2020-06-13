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
        assertEquals(0, calculateStatistics1.getAverageNumberOfPostPerUser());
        assertEquals(0, calculateStatistics1.getAverageNumberOfCommentsPerPost());
    }


    @Test
    public void testCalcuateAdvStatisticsWhenPost1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = new LinkedList<>();
        userName.add("Monika");
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.commentsCount()).thenReturn(5);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(200, calculateStatistics.getAverageNumberOfCommentsPerPost());
        assertEquals(1000, calculateStatistics.getAverageNumberOfPostPerUser());
    }
    @Test
    public void testCalculateAdvStatisticsWhenComments0(){
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
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerUser());
        assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost());
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommentsLessThenPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> userName = new LinkedList<>();
        userName.add("bartek");
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.usersNames()).thenReturn(userName);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, calculateStatistics.getAverageNumberOfCommentsPerPost());
        assertEquals(5, calculateStatistics.getAverageNumberOfCommentsPerUser());
    }
        @Test
        public void testCalculateAdvStatisticsWhenCommentsMoreThenPost(){

        //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics calculateStatistics = new CalculateStatistics();
            List<String> userName = new LinkedList<>();
            userName.add("bartek");
            when(statisticsMock.commentsCount()).thenReturn(25);
            when(statisticsMock.postsCount()).thenReturn(5);
            when(statisticsMock.usersNames()).thenReturn(userName);

         //When
            calculateStatistics.calculateAdvStatistics(statisticsMock);

         //Then
            assertEquals(5, calculateStatistics.getAverageNumberOfCommentsPerPost());
            assertEquals(5, calculateStatistics.getAverageNumberOfCommentsPerUser());
        }
}





