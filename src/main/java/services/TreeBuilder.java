package services;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null; // If the array is empty or root is null, return null
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1; // Start from the second element in the array
        while (i < arr.length) {
            TreeNode current = queue.poll();

            // Assign the left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Assign the right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " "); // Print the node's value

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    public static void traverseTreePreOrd(TreeNode root) {
        //pre-Order
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // Print the current node value
        traverseTreePreOrd(root.left);            // Recur on the left subtree
        traverseTreePreOrd(root.right);           // Recur on the right subtree
    }

    public static void traverseTreeInOrd(TreeNode root) {
        //InOrder
        if (root == null) {
            return;
        }
        traverseTreeInOrd(root.left);            // Recur on the left subtree
        System.out.print(root.val + " "); // Print the current node value
        traverseTreeInOrd(root.right);           // Recur on the right subtree
    }
}

