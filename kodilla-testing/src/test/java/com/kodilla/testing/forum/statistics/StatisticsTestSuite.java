package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.CalculateStatistics;
import com.kodilla.testing.forum.statistic.Statistics;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
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
    }


}
