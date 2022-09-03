package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        // Act
        long actual = service.sumSales(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldAvg() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        // Act
        long actual = service.avgSales(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldMonthWithPeakSales() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 8;

        // Act
        long actual = service.peakSales(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldMinMonth() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 9;

        // Act
        long actual = service.minSales(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }
    @Test
    public void shouldNotMinMonth() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 6;

        // Act
        long actual = service.minSales(sales);

        //Assert
        Assertions.assertNotEquals (expected, actual);
    }

    @Test
    public void shouldGtAvgCountMonth() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 5;

        // Act
        long actual = service.countSalesGreatestAvg(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }
    @Test
    public void shouldLwAvgCountMonth() {
        // Arrange
        StatsService service = new StatsService ();
        long [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        long expected = 5;

        // Act
        long actual = service.countSalesLowerAvg(sales);

        //Assert
        Assertions.assertEquals (expected, actual);
    }
}

