package services;

import java.util.ArrayList;

public class KthSmallestElementBST {

    //230

    static ArrayList<Integer> intArr = new ArrayList<>();

    public static int kthSmallest(TreeNode root, int k) {

        //since BST, do dfs traverse - in order and then find k-1 element
        traverseTreeInOrd(root);

        return intArr.get(k-1);
    }

    public static void traverseTreeInOrd(TreeNode root) {
        //InOrder
        if (root == null) {
            return;
        }
        traverseTreeInOrd(root.left);            // Recur on the left subtree
        intArr.add(root.val); // Print the current node value
        traverseTreeInOrd(root.right);           // Recur on the right subtree
    }
}
