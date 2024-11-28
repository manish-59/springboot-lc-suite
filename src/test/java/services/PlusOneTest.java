package services;

import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    public void testPlusOne(){

        int[] res = new PlusOne().plusOne(new int[]{4,3,2,1});
        for(int i:res){
            System.out.print(i + " ");
        }
        System.out.println();

        res = new PlusOne().plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
        for(int i:res){
            System.out.print(i + " ");
        }
    }
}
