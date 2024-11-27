package services;

import models.TreeNode;

public class DiameterBT {

    //543

    public int diameterOfBinaryTree(TreeNode root) {

        int[] dia = {0};
        heightOfTree(root, dia);
        return dia[0];
    }

    public int heightOfTree(TreeNode root, int[] dia){

        if(root == null) return 0;

        int left = heightOfTree(root.left , dia);
        int right = heightOfTree(root.right , dia);

        dia[0] = Math.max(dia[0],left + right);

        return Math.max(left, right) +1;
    }
}
