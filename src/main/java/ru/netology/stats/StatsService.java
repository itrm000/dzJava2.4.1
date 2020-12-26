package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales){  //покупка из покупок
            sum += sale;
        }
        return sum;
    }

    public long sumMonth(long[] sales) {
        long sum = sum(sales);
        long sumMonth = sum/sales.length;
        return sumMonth;
    }



    public long calculateSum(long[] sales) {
        long sum = sum(sales);
//        long sum = 0;
//        for (long sale : sales){  //покупка из покупок
//            sum += sale;
//        }
        return sum;
    }

    public long calculateSumMonth(long[] sales) {
        long sum = sum(sales);
        long sumMonth = sum/sales.length;
        return sumMonth;
    }

    public int calculateSumMax(long[] sales) {

        long sumMax = 0;//20
        int index = 0;//7

        for (int i = 0; i < sales.length; i++) {
            long monthSum = sales[i];
            if (monthSum >= sumMax) {
                sumMax = monthSum;
                index = i;
            }
        }

        return index + 1;//8
    }


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



    public long calculateSumLow(long[] sales) {

        long sumLow = 0; // количество месяцев, продажи ниже среднего
        long sumMonth = sumMonth(sales);

//        for (long sale : sales){
//            sumMonth += sale; // сумма продаж за 12 мес
//        }
//        sumMonth = sumMonth/sales.length;
        for (long sale : sales){
            if (sale < sumMonth){
                sumLow = sumLow + 1;
             }
        }

        return sumLow;
    }


    public long calculateSumHigh(long[] sales) {

        long sumHigh = 0; // количество месяцев, продажи ниже среднего
        long sumMonth = sumMonth(sales);

//        for (long sale : sales){
//            sumMonth += sale; // сумма продаж за 12 мес
//        }
//        sumMonth = sumMonth/sales.length;
        for (long sale : sales){
            if (sale < sumMonth){
                sumHigh = sumHigh + 1;
            }
        }

        return sumHigh;
    }


}




