package services;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    //297

    public static String serialize(TreeNode root) {

        if(root==null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            String temp;
            if(node==null){
                sb.append("null_");
            }else{
                sb.append(node.val).append("_");
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static TreeNode deserialize(String data) {

        if(data.isEmpty()) return null;
        String[] nodes = data.split("_");
        Queue<TreeNode> q = new LinkedList<>();

        TreeNode root =  new TreeNode(Integer.parseInt(nodes[0]));
        q.offer(root);
        int i = 1;
        while(!q.isEmpty() && i<data.length()){
            TreeNode node = q.poll();
            if(!nodes[i].equals("null")){
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(leftNode);
                node.left = leftNode;
            }
            i++;
            if(!nodes[i].equals("null")){
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodes[i]));
                q.offer(rightNode);
                node.right = rightNode;
            }
            i++;
        }
        return root;
    }

}
