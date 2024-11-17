package services;

public class CreateBTUseInPre {

    int preIndex = 0;
    int inIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int limit) {
        if (preIndex >= preorder.length) {
            return null;
        }

        if (inorder[inIndex] == limit) {
            inIndex++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, limit);

        return root;
    }
}
