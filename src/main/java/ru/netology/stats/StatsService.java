package ru.netology.stats;

public class StatsService<monthNumber> {


    public long calculateSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long calculateAverageSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public long monthWithMaxSales(long[] sales) {
        long currentMax = sales[0];

        for (long sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }

        long monthNumber = 0;
        long monthWithMax = 0;

        for (long sale : sales) {
            monthNumber++;
            if (sale == currentMax) {
                monthWithMax = monthNumber;
            }
        }
        return monthWithMax;
    }

    public long monthWithMinSales(long[] sales) {
    long currentMin = sales[0];

    for (long sale : sales) {
        if (currentMin > sale) {
            currentMin = sale;
        }
    }

    long monthNumber = 0;
    long monthWithMin = 0;

    for (long sale : sales) {
        monthNumber++;
        if (sale == currentMin) {
            monthWithMin = monthNumber;
        }
    }
        return monthWithMin;
    }

    public long monthsWithSalesBelowAverage(long[] sales){
        long month = 0;
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        for (long sale : sales) {
            if (sale < sum / sales.length) {
                month++;
            }
        }
        return month;
    }

    public long monthsWithSalesAboveAverage(long[] sales){
        long month = 0;
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        for (long sale : sales) {
            if (sale > sum / sales.length) {
                month++;
            }
        }
        return month;
    }
}



