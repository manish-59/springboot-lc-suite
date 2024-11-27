package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNode {

    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {
        val = 0;
        neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val) {
        val = _val;
        neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val, ArrayList<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public GraphNode createGraphNode(int[][] graphArray){

        //For simplicity, each node's value is the same as the node's index (1-indexed).

        if (graphArray == null || graphArray.length == 0) return null;

        Map<Integer, GraphNode> nodeMap = new HashMap<>();

        for (int i = 1; i <= graphArray.length; i++) {
            nodeMap.put(i, new GraphNode(i));
        }

        for (int i = 0; i < graphArray.length; i++) {
            GraphNode currentNode = nodeMap.get(i + 1);
            for (int neighbor : graphArray[i]) {
                currentNode.neighbors.add(nodeMap.get(neighbor));
            }
        }

        return nodeMap.get(1);
    }

    public void printGraphNode(GraphNode graphNode){

        if (graphNode == null) return;

        Map<Integer, Boolean> visited = new HashMap<>();
        dfs(graphNode, visited);
    }

    private void dfs(GraphNode graphNode, Map<Integer, Boolean> visited) {

        if (visited.containsKey(graphNode.val)) return;

        visited.put(graphNode.val, true);

        System.out.print("Node " + graphNode.val + " -> ");
        for (GraphNode neighbor : graphNode.neighbors) {
            System.out.print(neighbor.val + " ");
        }
        System.out.println();

        for (GraphNode neighbor : graphNode.neighbors) {
            dfs(neighbor, visited);
        }
    }
}
