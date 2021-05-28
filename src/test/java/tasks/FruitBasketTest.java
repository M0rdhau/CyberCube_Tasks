package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitBasketTest {

    @Test
    void _base_case_tests(){
        assertEquals(5, FruitBasket.collectFruits(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
        assertEquals(3, FruitBasket.collectFruits(new int[]{1,2,1}));
        assertEquals(3, FruitBasket.collectFruits(new int[]{0,1,2,2}));
        assertEquals(4, FruitBasket.collectFruits(new int[]{1,2,3,2,2}));
    }
}
