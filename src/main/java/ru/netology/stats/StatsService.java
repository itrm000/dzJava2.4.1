package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    // сумма продаж всего
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales)  {  //покупка из покупок
            sum += sale;  // sum = sum + sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long calculateSumMonth(long[] sales) {
        long sum = calculateSum(sales);
        long sumMonth = sum/sales.length;
        return sumMonth;
    }

    // месяц с макс продажами
    public int calculateSumMax(long[] sales) {
        long sumMax = 0;
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            long monthSum = sales[i];
            if (monthSum >= sumMax) {
                sumMax = monthSum;
                index = i;
            }
        }
        return index + 1;
    }

//  месяц с мин продажами
    public long calculateSumMin(long[] sales) {

        long sumMin = 100;
        int index = 0;

        for (int i = 0; i < sales.length; i++) {
            long monthSum = sales[i];

            if (monthSum <= sumMin) {
                sumMin = monthSum;
                index = i;
            }
        }
        return index + 1;
    }

// количество месяцев - продажи ниже среднего
    public long calculateSumLow(long[] sales) {
        long sumLow = 0; // количество месяцев, продажи ниже среднего
        long sumMonth = calculateSumMonth(sales);

        for (long g : sales){
            if (g < sumMonth){
                sumLow = sumLow + 1;
             }
        }
        return sumLow;
    }


    // количество месяцев, продажи выше среднего
    public long calculateSumHigh(long[] sales) {
        long sumHigh = 0; // количество месяцев, продажи ниже среднего
        long sumMonth = calculateSumMonth(sales);

        for (long sale : sales){
            if (sale < sumMonth){
                sumHigh = sumHigh + 1;
            }
        }
        return sumHigh;
    }


}




