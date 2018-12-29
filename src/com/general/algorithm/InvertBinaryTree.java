package com.general.algorithm;

/**
 *  反转二叉树
 *
 * */
public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    private static TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        root.left = invertTree(root.left);
        root.right  = invertTree(root.right);

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val= val;
    }

    @Override
    public String toString() {
        System.out.println(left.val+"<--------:"+val+ "-------->"+right.val);
        return super.toString();
    }
}