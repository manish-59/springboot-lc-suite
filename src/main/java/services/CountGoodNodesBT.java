package services;

public class CountGoodNodesBT {

    static int ctr;
    public static int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        ctr=0;
        helper(root,root.val);
        return ctr;
    }
    public static void helper(TreeNode root,int max){
        if(root==null){
            return;
        }
        if(root.val>=max){
            ctr++;
            max=root.val;

        }
        helper(root.left,max);
        helper(root.right,max);
    }
}
