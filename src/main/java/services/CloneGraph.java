package services;

import models.GraphNode;
import java.util.HashMap;

public class CloneGraph {

    //133

    public GraphNode cloneGraph(GraphNode node) {

        if (node == null) return null;

        HashMap<GraphNode, GraphNode> map = new HashMap<>();

        return dfs(node, map);
    }

    public GraphNode dfs(GraphNode node, HashMap<GraphNode, GraphNode> map) {
        if (map.containsKey(node)) return map.get(node);
        GraphNode curr = new GraphNode(node.val);
        map.put(node, curr);

        for (GraphNode neighbor : node.neighbors) {
            curr.neighbors.add(dfs(neighbor, map));
        }

        return curr;
    }
}
