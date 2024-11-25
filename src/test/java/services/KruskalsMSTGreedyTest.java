package services;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KruskalsMSTGreedyTest {

    @Test
    public void testKruskalsMSTGreedy(){

        List<KruskalsMSTGreedy.Edge> graphEdges = new ArrayList<KruskalsMSTGreedy.Edge>(
                List.of(new KruskalsMSTGreedy.Edge(0, 1, 10), new KruskalsMSTGreedy.Edge(0, 2, 6),
                        new KruskalsMSTGreedy.Edge(0, 3, 5), new KruskalsMSTGreedy.Edge(1, 3, 15),
                        new KruskalsMSTGreedy.Edge(2, 3, 4)));

        KruskalsMSTGreedy.kruskals(4, graphEdges);
    }
}
