package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long sum = service.calculateSum(array);

        assertEquals(180, sum);
    }

    @Test
    void calculateSumMonth() {
        StatsService service = new StatsService();

        float sumMonth = service.calculateSumMonth(array);

        assertEquals(15, sumMonth);
    }

    @Test
    void calculateSumMax() {
        StatsService service = new StatsService();

        float sumMax = service.calculateSumMax(array);

        assertEquals(8, sumMax);

    }


    @Test
    void calculateSumMin() {
        StatsService service = new StatsService();

        float sumMin = service.calculateSumMin(array);

        assertEquals(9, sumMin);
    }


    @Test
    void calculateSumLow() {
        StatsService service = new StatsService();

        float sumLow = service.calculateSumLow(array);

        assertEquals(5, sumLow);
    }

    @Test
    void calculateSumHigh() {
        StatsService service = new StatsService();

        float sumHigh = service.calculateSumHigh(array);

        assertEquals(5, sumHigh);
    }
}