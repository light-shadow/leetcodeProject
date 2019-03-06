package com.general.algorithm;

import java.util.ArrayList;
import java.util.List;
import com.general.structure.TreeNode;

/**
 * 257. Binary Tree Paths
 * status: pass
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        com.general.structure.TreeNode root = new com.general.structure.TreeNode(3);
        com.general.structure.TreeNode left = new com.general.structure.TreeNode(9);
        root.setLeft(left);
        com.general.structure.TreeNode right1 = new com.general.structure.TreeNode(20);
        root.setRight(right1);
        com.general.structure.TreeNode right2 = new com.general.structure.TreeNode(15);
        right1.setLeft(right2);
        com.general.structure.TreeNode right3 = new com.general.structure.TreeNode(7);
        right1.setRight(right3);

        System.out.println(binaryTreePaths(root));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        String str = "" + root.getVal();
        helper(root, str, list);
        return list;
    }

    public static  void helper(TreeNode root, String eachSum, List<String> result){
        if(root != null){
            if(root.getLeft() != null){
                helper(root.getLeft(), eachSum+"->"+root.getLeft().getVal(), result);
            }
            if(root.getRight() != null){
                helper(root.getRight(), eachSum+"->"+root.getRight().getVal(), result);
            }
            if(root.getRight() == null && root.getLeft() == null){
                result.add(eachSum);
            }
        }
        else{
            return;
        }
    }
}
