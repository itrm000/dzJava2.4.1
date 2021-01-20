package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void calculateSum() {
        long sum = service.calculateSum(array);
        assertEquals(180, sum);
    }

    @Test
    void calculateSumMonth() {
        float sumMonth = service.calculateSumMonth(array);
        assertEquals(15, sumMonth);
    }

    @Test
    void calculateSumMax() {
        float sumMax = service.calculateSumMax(array);
        assertEquals(8, sumMax);
    }


    @Test
    void calculateSumMin() {
        float sumMin = service.calculateSumMin(array);
        assertEquals(9, sumMin);
    }


    @Test
    void calculateSumLow() {
        float sumLow = service.calculateSumLow(array);
        assertEquals(5, sumLow);
    }

    @Test
    void calculateSumHigh() {
        float sumHigh = service.calculateSumHigh(array);
        assertEquals(5, sumHigh);
    }
}