package services;

public class BalancedBinaryTree {

    //110
    public static boolean isBalanced(TreeNode root) {
                if (root == null) return true;

                int left = dfs(root.left);
                int right = dfs(root.right);

                if (Math.abs(left - right) > 1) return false;

                return isBalanced(root.left) && isBalanced(root.right);
    }

     static int dfs(TreeNode root) {

         if (root == null) return 0;

         int l = dfs(root.left);

         int r = dfs(root.right);

         return Math.max(l, r) + 1;
     }

}
