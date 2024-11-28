package services;

import models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraverseBT {

    //94
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        inorderTraversal(root.left);            // Recur on the left subtree
        res.add(root.val); // Print the current node value
        inorderTraversal(root.right);

        return res;
    }
}
