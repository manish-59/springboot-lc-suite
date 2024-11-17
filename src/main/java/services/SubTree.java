package services;

public class SubTree {

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public static boolean isIdentical(TreeNode node, TreeNode subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.val!=subroot.val){
            return false;
        }
        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
}
