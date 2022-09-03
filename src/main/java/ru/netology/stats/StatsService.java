package ru.netology.stats;

public class StatsService {

    /**
     * Сумму всех продаж
     *
     * @param sales
     * @return
     */
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    /**
     * Среднюю сумму продаж в месяц
     *
     * @param sales
     * @return
     */
    public long avgSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        long sum = sumSales(sales);
        long avg = sum / sales.length;
        return avg;
    }

    /**
     * Номер месяца, в котором был пик продаж
     *
     * @param sales
     * @return
     */
    public int peakSales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        long hit = 0;
        int maxMonth = 1;
        int month = 1;
        for (long sale : sales) {
            if (hit <= sale) {
                hit = sale;
                maxMonth = month;
            }
            month++;
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countSalesLowerAvg(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int countSalesGreatestAvg(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}
