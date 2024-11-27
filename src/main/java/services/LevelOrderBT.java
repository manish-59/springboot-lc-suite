package services;
import models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderBT {

    //102

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        traverseTree(root, tree, 0);
        return tree;
    }

    public void traverseTree(TreeNode root, List<List<Integer>> tree, int idx) {
        if (root == null) return;

        if (tree.size() == idx) {
            tree.add(new ArrayList<>());
        }
        tree.get(idx).add(root.val);
        traverseTree(root.left, tree, idx + 1);
        traverseTree(root.right, tree, idx + 1);
    }
}
