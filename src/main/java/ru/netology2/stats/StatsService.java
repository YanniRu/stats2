package ru.netology2.stats;

public class StatsService {
    public int getSumSales(int[] sales) { // Сумма всех продаж

        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int getAverageSales(int[] sales) {  // Средняя сумма продаж в месяц
        return getSumSales(sales) / sales.length;
    }

    public int getMaxMonth(int[] sales) { // номер месяца, в котором был пик продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int getMinMonth(int[] sales) { // номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int belowCalcAverageMonth(int[] sales) { // количество месяцев, в которых продажи были ниже среднего

        int count = 0;
        int salesAvg = getAverageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < salesAvg) {
                count++;
            }
        }
        return count;
    }

    public int aboveCalcAverageMonth(int[] sales) { // количество месяцев, в которых продажи были выше среднего

        int count = 0;
        int salesAvg = getAverageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > salesAvg) {
                count++;
            }
        }
        return count;
    }
}
