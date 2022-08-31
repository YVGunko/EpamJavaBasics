package com.epam.learn.JavaBasicsMap;

import java.util.*;

public class SumNodes {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(){
            super();
        }
        public TreeNode(int value){
            super();
            this.value = value;
        }
        public TreeNode(int value, TreeNode left, TreeNode right){
            super();
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    static class Pair<K, V>{
        private K key;
        private V value;

        public Pair (K key, V value){
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public K getKey() {
            return key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }
    }


    public static void main(String[] args) {

    Properties p = new Properties();
//        3
//       / \
//      7   5
//         / \
//        9   1
//             \
//              20

        TreeNode item4 = new TreeNode(20);
        TreeNode item5 = new TreeNode(4);
        TreeNode item6 = new TreeNode(6);
        TreeNode item = new TreeNode(1, item5,item4);
        TreeNode item1 = new TreeNode(9);
        TreeNode item7 = new TreeNode(7);
        TreeNode item2 = new TreeNode(5, item1,item);
        TreeNode item3 = new TreeNode(7, item6,item7);
        TreeNode root = new TreeNode(3, item3,item2);
        System.out.println(sumNodes(root));
    }

    public static Map<Integer, Integer> sumNodes(TreeNode root){
        Map<Integer, Integer> resultMap = new HashMap<>();
        Queue <Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.add(new Pair<>(root, 0));


        while (!queue.isEmpty()){
            Pair<TreeNode,Integer> entry = queue.remove();
            TreeNode curNode = entry.getKey();
            int curLevel = entry.getValue();
            resultMap.compute(curLevel, (k,v) -> (v == null) ? curNode.value : v + curNode.value);
            if(curNode.left != null) queue.add( new Pair<>(curNode.left, curLevel+1));
            if(curNode.right != null) queue.add( new Pair<>(curNode.right, curLevel+1));
        }
        return resultMap;
    }

}


