package BianrySort;

import javafx.scene.shape.VLineTo;

public class Node {

    int value;
    Node left;
    Node right;

    public int height(){
        return Math.max(left==null?0:left.height(),right==null?0:right.height())+1;
    }

    //获取左子树的高度
    public int leftHeight(){
        if(left==null){
            return 0;
        }
        return left.height();
    }

    //获取右子树的高度
    public int rightHeight(){
        if(right==null){
            return 0;
        }
        return right.height();
    }



    public Node(int value){
        this.value=value;
    }

    public void add(Node node){
        if(node==null){
            return;
        }

        //当前子树的根节点的值与传入节点的值比较
        //添加的节点比当前节点的值小
        if(node.value<this.value) {
            //如果左节点为空
            if (this.left == null) {
                this.left = node;
            }
            //如果不为空
            else {
                this.left.add(node);
            }
        }else{

                if(this.right==null){
                    this.right=node;
                }else{
                    this.right.add(node);
                }
            }

        //查询是否平衡
        //进行右旋转
        if(leftHeight()-rightHeight()>=2){
            //左右旋
            if(left!=null&&left.leftHeight()<left.rightHeight()){
                left.leftRotate();
                rightRotate();

            }
            //只右旋
            else {
                rightRotate();
            }
        }
        //左旋转
        if(leftHeight()-rightHeight()<=-2) {
            //左右旋
            if(right!=null&&right.rightHeight()<right.leftHeight()){
                right.rightRotate();
                leftRotate();
            }
            //只左旋
            else {
                leftRotate();
            }

        }
    }

    private void leftRotate() {

        Node newLeft = new Node(value);
        newLeft.left=left;
        newLeft.right=right.left;
        value=right.value;
        right=right.right;
        left=newLeft;

    }

    private void rightRotate() {
        //创建一个新的节点，值等于当前节点的值
        Node newRight = new Node(value);
        //把新节点的右子树设置为当前节点的右子树
        newRight.right=right;
        //把新节点的左子树设置为当前节点的左子树的右子树
        newRight.left=left.right;
        //把当前节点的值换为左子节点的值
        value=left.value;
        //把当前节点的左子树设置为左子树的左子树
        left=left.left;
        //把当前节点的右子树设置为新节点
        right=newRight;


    }

    public void midShow(Node node) {
        if(node==null){
            return;
        }
        node.midShow(node.left);
        System.out.println(node.value);
        node.midShow(node.right);

    }

    public Node searchNode(int value) {
        if(this.value==value){
            return this;
        }else
            if(value<this.value){
                if(left==null) {
                    return null;
                }
              return  left.searchNode(value);

        }else {
                if(right==null){
                    return null;
                }
                return right.searchNode(value);
            }
    }

    public Node searchParent(int value) {
        if((this.left!=null&&this.left.value==value)||(this.right!=null&&this.right.value==value)){
            return this;
        }else {
            if(this.value>value&&this.left!=null){
                return this.left.searchParent(value);
            }else
                if(this.value<value&&this.right!=null){
                    return this.right.searchParent(value);
                }
        }
        return null;
    }
}
