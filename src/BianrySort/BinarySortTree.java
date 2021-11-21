package BianrySort;

public class BinarySortTree {

    Node root;

    public void add(Node node) {
        //如果是一颗空树
        if(root==null){
            root=node;
        }else{
            root.add(node);
        }
    }

    //中序遍历
    public void midShow(){
        if(root!=null){
            root.midShow(root);
        }
    }
    public Node Search(int value){
        if(root==null){
            return  null;
        }else {
           return root.searchNode(value);
        }
    }

    public void delete(int value){
        if(root==null){
            return;
        }else {
            //找打这个节点
            Node target = Search(value);
            //如果没有这个节点
            if(target==null){
                return;
            }
            //找到他的父节点
            Node parent = searchParent(value);
            //删除的节点为叶子节点
            if(target.left==null&&target.right==null){
                //要删除父节点的左子节点
                if(parent.left.value==value){
                    parent.left=null;
                }
                //要删除父节点的右子节点
                else {
                    parent.right=null;
                }
                //要删除的节点右两个子节点的情况
            }else if(target.left!=null&&target.right!=null){
                //删除右子树中值最小的节点，获取该节点的值
                int min = deleteMin(target.right);
                //替换目标节点的值
                target.value=min;
                //要删除的节点右一个左子节点或一个右子几点
            }else {
                //有左子节点
                if(target.left!=null){
                    //要删除的节点是父节点的左子节点
                    if(parent.left.value==value){
                        parent.left=target.left;
                    }
                    //要删除父节点的右子节点
                    else {
                        parent.right=target.left;
                    }
                    //有右子节点
                }else {
                    //要删除的节点是父节点的右子节点
                    if(parent.left.value==value){
                        parent.left=target.right;
                    }
                    //要删除父节点的右子节点
                    else {
                        parent.right=target.right;
                    }

                }

            }


        }
    }

    //删除一颗树中最小的节点
    private int deleteMin(Node node) {

        Node target = node;
        //递归向左找
        while(target.left!=null){
            target=target.left;
        }
        //删除最小的节点
        delete(target.value);
        return target.value;
    }

    public Node searchParent(int value){
        if(root==null){
            return null;
        }else {
          return   root.searchParent(value);
        }
    }
}
