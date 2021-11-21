package Tree;

public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BianryTree binTree = new BianryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binTree.setRoot(root);
        //创建左节点节点
        TreeNode rootL = new TreeNode(2);
        //把创建的节点设置为根节点的左节点
        root.setLeftNode(rootL);
        //创建第右节点
        TreeNode rootR = new TreeNode(3);
        //把创建的节点设置为根节点的右节点
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        TreeNode fiveNode = new TreeNode(5);
        rootL.setRightNode(fiveNode);
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历
        binTree.frontShow();
        System.out.println("=========");
        //中序遍历
        binTree.midShow();
        System.out.println("=========");
        //中序线索化二叉树
        binTree.treeNodes();
        binTree.treeIterate();




    }
}
