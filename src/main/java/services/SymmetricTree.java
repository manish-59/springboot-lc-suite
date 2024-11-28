package services;

import models.TreeNode;

public class SymmetricTree {

    //101

    public boolean isSymmetric(TreeNode root) {

        return traverse(root.left, root.right);
    }

    private boolean traverse(TreeNode currentNodeLeft, TreeNode currentNodeRight) {
        if (currentNodeLeft == null && currentNodeRight == null) return true;
        if (currentNodeLeft == null || currentNodeRight == null) return false;
        if (currentNodeLeft.val != currentNodeRight.val) return false;

        return traverse(currentNodeLeft.left, currentNodeRight.right) &&
                traverse(currentNodeLeft.right, currentNodeRight.left);
    }
}
