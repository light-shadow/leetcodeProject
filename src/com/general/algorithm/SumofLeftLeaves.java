package com.general.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import com.general.structure.TreeNode;
import edu.princeton.cs.algs4.In;

/**
 * 404. Sum of Left Leaves
 * status:
 */
public class SumofLeftLeaves {

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

        System.out.println(sumOfLeftLeaves(root));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return 0;
        }
        helper(root, list);
        return list.stream()
                .flatMapToInt(IntStream::of)
                .sum();
    }

    public static  void helper(com.general.structure.TreeNode root,  List<Integer> result){
        if(root != null){
            if(root.getLeft() != null){
                result.add(root.getLeft().getVal());
                helper(root.getLeft(),  result);
            }
            if(root.getRight() != null){
                helper(root.getRight(),  result);
            }
        }
        else{
            return;
        }
    }
}
