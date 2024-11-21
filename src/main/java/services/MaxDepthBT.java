package services;

public class MaxDepthBT {

    //104

    public int maxDepth(TreeNode root) {

        int l=0,r=0;
        if(root == null) return 0;

        l = maxDepth(root.left);
        r = maxDepth(root.right);

        return 1+ Math.max(l,r);
    }
}
