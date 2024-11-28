package services;

import org.junit.jupiter.api.Test;

public class DistriMoneyChildTest {

    @Test
    public void testDistriMoneyChild(){

        System.out.println(new DistriMoneyChild().distMoney(20,3));
        System.out.println(new DistriMoneyChild().distMoney(16,2));
    }
}
