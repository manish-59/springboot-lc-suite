package services;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PartitionLabelsGreedyTest {

    @Test
    public void testPartitionLabelsGreedy(){

        List<Integer> res = new PartitionLabelsGreedy().partitionLabels("ababcbacadefegdehijhklij");
        for(Integer e: res){
            System.out.println(e);
        }
    }
}
