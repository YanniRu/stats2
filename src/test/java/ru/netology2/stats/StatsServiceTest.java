package ru.netology2.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test // Сумма всех продаж
    public void getSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test // Средняя сумма продаж в месяц
    public void getAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSales = 15;
        int actualAverageSales = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test // номер месяца, в котором был пик продаж
    public void getMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 5;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test // номер месяца, в котором был минимум продаж
    public void getMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 8;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test // количество месяцев, в которых продажи были ниже среднего
    public void belowCalcAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowCalc = 5;
        int actualBelowCalc = service.belowCalcAverageMonth(sales);

        Assertions.assertEquals(expectedBelowCalc, actualBelowCalc);
    }

    @Test  // количество месяцев, в которых продажи были выше среднего
    public void aboveCalcAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveCalc = 5;
        int actualAboveCalc = service.belowCalcAverageMonth(sales);

        Assertions.assertEquals(expectedAboveCalc, actualAboveCalc);
    }
}
