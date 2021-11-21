package Tree;

public class TreeNode {

    //节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;
    //标识指针类型
    int leftType;
    int rightType;


    public TreeNode(int value){
        this.value=value;
    }

    //设置左儿子
    public void setLeftNode(TreeNode leftNode){
        this.leftNode=leftNode;
    }
    //设置右儿子
    public void setRightNode(TreeNode rightNode){
        this.rightNode=rightNode;
    }

    //前序遍历
    public void  frontShow() {
        //先遍历当前节点的内容
        System.out.println(value);
        //左节点
        if(leftNode!=null){
            leftNode.frontShow();
        }
        //右节点
        if(rightNode!=null){
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void midShow() {
        //左节点
        if(leftNode!=null){
            leftNode.midShow();
        }
        //当前节点
        System.out.println(value);
        //右节点
        if(rightNode!=null){
            rightNode.midShow();
        }
    }
    //后续遍历
    public void afterShow() {
        //左节点
        if(leftNode!=null){
            leftNode.afterShow();
        }
        //右节点
        if(rightNode!=null){
            rightNode.afterShow();
        }
        //当前节点
        System.out.println(value);
    }
    //删除子树
    public void delete(int i) {
        TreeNode parent = this;
        //判断左儿子
        if(parent.leftNode!=null&&parent.leftNode.value==i){
            parent.leftNode=null;
            return;
        }
        //判断右儿子
        if(parent.leftNode!=null&&parent.rightNode.value==i){
            parent.rightNode=null;
            return;
        }
        //递归检查并删除左儿子
        parent=leftNode;
        if(parent!=null){
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent=rightNode;
        if(parent!=null){
            parent.delete(i);
        }
    }


    //合并二叉树
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        t1.value += t2.value;
        t1.leftNode = mergeTrees(t1.leftNode, t2.leftNode);
        t1.rightNode = mergeTrees(t1.rightNode, t2.rightNode);
        return t1;
    }
}
