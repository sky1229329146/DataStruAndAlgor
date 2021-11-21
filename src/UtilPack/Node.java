package UtilPack;

//一个节点
public class Node {

    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){

        this.data=data;
    }
    //为节点追回节点
    public Node append(Node node){

        //当前节点
        Node currentNode=this;
        //循环向后找
        while(true){
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为null，当前节点为最后一个节点
            if(nextNode==null){
                break;
            }
            //赋给当前节点
            currentNode=nextNode;

        }

        //把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next=node;
        return this;
    }

    //显示所有节点信息
    public void show(){
        Node currentNode =this;
        while (true){
            System.out.println(currentNode.data+" ");
            //取出下一个节点
            currentNode=currentNode.next;
            //如果是最后一个节点
            if(currentNode==null){
                break;
            }
        }

    }
    //插入一个节点作为当前节点的下一个节点
    public void after(Node node){
        //取出下一个节点，作为下下一个节点
        Node nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next=node;
        //把下下一个节点作为新节点的下一个节点
        node.next=nextNext;
    }
    //删除下一个节点
    public void removeNext(){
        //取出下下一个节点
        Node newNext = next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next=newNext;
    }
    //递归反转链表
    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
        //迭代反转链表
    public static Node reverseList(Node node) {
        Node pre = null;
        Node next = null;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
    //排序
    public static Node sort(Node temp) {

        Node pre = null;
        Node temp1 = null;

        while (true) {

            if (temp.next != null && temp.data > temp.next.data) {

                temp1.data = temp.data;
                temp.data = temp.next.data;
                temp.data = temp1.data;
            }
            temp = temp.next;

        }
        //return;
    }


    //获取下一个节点
    public Node next(){
        return this.next;
    }
    //获取节点中的数据
    public int getData(){
        return  this.data;
    }
}
