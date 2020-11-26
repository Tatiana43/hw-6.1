package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void calculateSalesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSalesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverageSalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.monthWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.monthWithMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWithSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsWithSalesBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWithSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsWithSalesAboveAverage(sales);
        assertEquals(expected, actual);
    }
}