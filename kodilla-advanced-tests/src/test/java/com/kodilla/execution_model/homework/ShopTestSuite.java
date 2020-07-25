package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    Order chair = new Order("jonny", 450, LocalDate.of(2020, 6, 22));
    Order table = new Order("Maggir", 1120, LocalDate.of(2020,7,21));
    Order couch = new Order("Javier" , 2500, LocalDate.of(2019,2,21));
    Order wardrobe = new Order("Ola", 1910, LocalDate.of(2020,4,12));

    @Test
    public void shouldAddOrderToShop() {
        // When
        int numberOfOrders = shop.getSize();
        // Then
        assertEquals(4, numberOfOrders);
    }

    @Test
    public void shouldCalculateSum() {
        // When
        List<Order> sum = shop.sumAll();
        // Then
        assertEquals(5980, sum);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(chair);
        shop.addOrder(table);
        shop.addOrder(couch);
        shop.addOrder(wardrobe);

    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}