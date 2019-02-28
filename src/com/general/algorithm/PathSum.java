package com.general.algorithm;

import com.general.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 112.Path Sum
 * result: pass
 */
public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right2 = new TreeNode(3);
        root.setLeft(left1);
        root.setRight(right2);
        System.out.println(hasPathSum(root, 3));


    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        helper(root, 0, list);
        if(list.contains(sum)){
            return true;
        }
        return false;
    }

    /**
     * 记录每个路径的和 最后判断给出的和是否在列表内
     * @param root
     * @param result
     * @return
     */
    public static void helper(TreeNode root, Integer eachSum, List<Integer> result){
        if(root != null){
            eachSum+= root.getVal();
            if(root.getLeft() != null){
                helper(root.getLeft(), eachSum, result);
            }
            if(root.getRight() != null){
                helper(root.getRight(), eachSum, result);
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



