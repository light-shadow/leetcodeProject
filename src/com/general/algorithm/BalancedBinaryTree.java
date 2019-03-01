package com.general.algorithm;

import com.general.structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 110.Balanced Binary Tree
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.setLeft(left);
        TreeNode right1 = new TreeNode(20);
        root.setRight(right1);
        TreeNode right2 = new TreeNode(15);
        right1.setLeft(right2);
        TreeNode right3 = new TreeNode(7);
        right1.setRight(right3);
        System.out.println(isBalanced(root));

//        TreeNode root2 = new TreeNode(1);
//        TreeNode righ1 = new TreeNode(2);
//        TreeNode righ2 = new TreeNode(3);
//        righ1.setRight(righ2);
//        root2.setRight(righ1);
//
//        System.out.println(isBalanced(root2));


    }

    public static boolean isBalanced(TreeNode root) {
       String string="";
       List<String> list = new ArrayList<>();
       List<Integer> lengthList = new ArrayList<>();
        helper(root, string, list);
        if(list.size() == 0){
            return true;
        }
        for(String str: list){
            lengthList.add(str.split("-").length);
        }
        if(lengthList.size()>1){
            return Collections.max(lengthList) - Collections.min(lengthList) <= 1;
        }
        else if(lengthList.size() == 1){
            return lengthList.get(0) <= 1;
        }
        else{
            return true;
        }


    }

    /**
     * 记录每个路径的和 最后判断给出的和是否在列表内
     * @param root
     * @param result
     * @return
     */
    public static void helper(com.general.structure.TreeNode root, String string, List<String> result){
        if(root != null){
            string += root.getVal()+"-";
            if(root.getLeft() == null && root.getRight() == null){
                result.add(string);
            }
            if(root.getLeft() != null){
                helper(root.getLeft(), string, result);
            }
            if(root.getRight() != null){
                helper(root.getRight(), string, result);
            }
        }
        else{
            return;
        }


    }
}
