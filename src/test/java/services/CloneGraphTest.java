package services;

import models.GraphNode;
import org.junit.jupiter.api.Test;

public class CloneGraphTest {

    GraphNode gn = new GraphNode();

    @Test
    public void testCloneGraph(){

        gn.printGraphNode(new CloneGraph().cloneGraph(gn.createGraphNode(new int[][]{{2,4},{1,3},{2,4},{1,3}})));

    }
}
