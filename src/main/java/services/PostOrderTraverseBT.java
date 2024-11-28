package services;

import models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraverseBT {

    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        postorderTraversal(root.left);            // Recur on the left subtree
        postorderTraversal(root.right);           // Recur on the right subtree
        res.add(root.val); // Print the current node value
        return res;
    }
}
