package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 111. Minimum Depth of Binary Tree
 * status: pass
 */
public class MinimumDepthofBinaryTree {

    public static void main(String[] args) {

    }

    public static int minDepth(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, 0, list);
        if(list.size() ==0){
            return 0;
        }
        return Collections.min(list);
    }

    public static  void helper(TreeNode root, Integer eachSum, List<Integer> result){
        if(root != null){
            eachSum+= 1;
            if(root.left != null){
                helper(root.left, eachSum, result);
            }
            if(root.right != null){
                helper(root.right, eachSum, result);
            }
            if(root.right == null && root.left == null){
                result.add(eachSum);
            }
        }
        else{
            return;
        }
    }
}



