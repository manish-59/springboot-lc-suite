package services;

import models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraverseBT {

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        res.add(root.val); // Print the current node value
        preorderTraversal(root.left);            // Recur on the left subtree
        preorderTraversal(root.right);           // Recur on the right subtree
        return res;
    }
}
