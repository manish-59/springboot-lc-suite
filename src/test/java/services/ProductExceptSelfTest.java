package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProductExceptSelfTest {

    ProductExceptSelf productExceptSelf= new ProductExceptSelf();

    @Test
    public void testProductExceptSelf(){

        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
