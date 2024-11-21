package services;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KClosest2OriginTest {

    KClosest2Origin kc = new KClosest2Origin();

    @Test
    public void testKClosest2Origin(){

        System.out.print(Arrays.deepToString(kc.kClosest(new int[][]{{1,0}, {0,1}}, 2)));
    }
}
