package services;

import models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightSideViewBT {

    //199

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list = new ArrayList();
        recursion(root,list,0);
        return list;
    }
    public void recursion (TreeNode root, List<Integer> list, int depth) {
        if (root==null)
            return;

        if(depth==list.size())
            list.add(root.val);

        recursion(root.right,list,depth+1);
        recursion(root.left,list,depth+1);
    }
}
