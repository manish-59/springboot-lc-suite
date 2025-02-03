package services;

import models.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllNodesDistanceK {

    //LC 863
    List<Integer> rst = new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, Integer> map = new HashMap<>();
        helper(target, root, map);
        dfs(root, map, k, 0);
        return rst;
    }

    public int helper(TreeNode target, TreeNode node, Map<TreeNode, Integer> map){
        if(node == null){
            return -1;
        }

        if(node == target){
            map.put(node, 0);
            return 0;
        }

        int left = helper(target, node.left, map);
        int right = helper(target, node.right, map);

        if(left >= 0){
            map.put(node, left + 1);
            return left + 1;
        }

        if(right >= 0){
            map.put(node, right + 1);
            return right + 1;
        }
        return -1;
    }

    public void dfs(TreeNode node, Map<TreeNode, Integer> map, int k, int length){
        if(node == null){
            return;
        }

        if(map.containsKey(node)){
            length = map.get(node);
        }

        if(length == k){
            rst.add(node.val);
        }

        dfs(node.left, map, k, length + 1);
        dfs(node.right, map, k, length + 1);
    }
}
