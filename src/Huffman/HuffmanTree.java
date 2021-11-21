package Huffman;

import java.util.ArrayList;
import java.util.Collections;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] arr  = new int[]{3,7,8,29,5,11,23,14};
        Node node = createHuffmanTree(arr);
        System.out.println(node);
    }

    //创建赫夫曼树
    public static Node createHuffmanTree(int[] arr){
        //先使用数组中所有的元素创建若干个二叉树（只有一个节点）
        ArrayList<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        while (nodes.size()>1) {
            //排序
            Collections.sort(nodes);
            //取出权值最小的两个树
            Node left = nodes.get(nodes.size() - 1);
            Node right = nodes.get(nodes.size() - 2);
            //创建一颗新的二叉树
            Node parent = new Node(left.value + right.value);
            //把取出来的两个二叉树移除
            nodes.remove(left);
            nodes.remove(right);
            //放入原来的二叉树集合中
            nodes.add(parent);
        }
        return  nodes.get(0);
    }
}
