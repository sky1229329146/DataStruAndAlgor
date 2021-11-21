package BianrySort;

public class TestBinaryTree {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,6,7,5,4};
       // int[] arr = new int[]{2,1,4,3,5,6};
        //int[] arr = new int[]{};
        //创建一颗二叉排序树
        BinarySortTree bst = new BinarySortTree();
        //循环添加
        for (int i : arr) {
            bst.add(new Node(i));
        }
        //中序遍历
        bst.midShow();

        //查看高度
        System.out.println(bst.root.height());
        System.out.println(bst.root.value);




    }
}
