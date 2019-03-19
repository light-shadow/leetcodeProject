package com.general.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import  com.general.structure.TreeNode;

/**
 * 965. Univalued Binary Tree
 * status:pass
 */
public class UnivaluedBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isUnivalTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return true;
        }
        helper(root, list);
        Set<Integer> set= new HashSet<>(list);
        return  set.size() ==1;
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
