package Tree;

public class BianryTree {

    TreeNode root;

    //临时存储前驱节点
    TreeNode pre = null;

    //遍历线索二叉树
    public void treeIterate(){
        //由于临时存储当前遍历节点
        TreeNode node = root;
        while (node!=null){
            //循环找到最开始的节点
            while(node.leftType == 0){
                node = node.leftNode;
            }
            //打印当前节点的值
            System.out.println(node.value);
            //如果当前节点的右指针指向的是后继节点，可能后继节点还有后继节点
            while(node.rightType==1){
                node = node.rightNode;
                System.out.println(node.value);
            }
            //替换遍历的节点
            node = node.rightNode;
        }
    }

    //设置根节点
    public void setRoot(TreeNode root){
        this.root = root;
    }

    //中序线索化二叉树
    public void treeNodes(){
        treeNodes(root);

    }

    public void treeNodes(TreeNode node){
        //当前节点如果为null，直接返回
        if(node==null){
            return;
        }
        //处理左子树
        treeNodes(node.leftNode);
        //处理前驱节点
        if(node.leftNode==null){
            //让当前节点的左指针指向前驱节点
            node.leftNode=pre;
            //改变当前节点左指针的类型
            node.leftType=1;
        }
        //处理前驱的右指针，如果前驱节点的右指针是null（没有指向右子树）
        if(pre!=null&&pre.rightNode==null){
            //让前驱节点的右指针指向当前节点
            pre.rightNode=node;
            //改变前驱节点的右指针类型
            pre.rightType=1;
        }
        //每处理一个节点，当前节点是下一个节点的前驱节点
        pre = node;
        //处理右子树
        treeNodes(node.rightNode);

    }


    //获取根节点
    public TreeNode getRoot(){
        return root;
    }


    public void frontShow() {
        if(root!=null)
        root.frontShow();
    }

    public void midShow() {
        if(root!=null)
        root.midShow();
    }

    public void afterShow() {
        if(root!=null)
        root.afterShow();
    }

    public void delete(int i) {
        if(root.value==i){
            root=null;

        }else{
            root.delete(i);
        }
    }


}
