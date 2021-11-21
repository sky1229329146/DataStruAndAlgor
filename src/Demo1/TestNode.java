package Demo1;

import UtilPack.Node;

public class TestNode {

    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(2);
        Node n2 =  new Node(1);
        Node n3 = new Node(3);
        Node N0 = new Node(0);
        //Node n5 = new Node(5);

        Node n4 = n1.append(n2).append(n3).append(new Node(4));
        //n1.append(n2).append(n3).reverse(n1);
        //System.out.println(n1.getData());
        //System.out.println(n1.next().next.getData());

        //n1.show();
        //n1.next().removeNext();
       // n1.show();
//        Node node = new Node(5);
//        n1.next().after(node);
        n4.show();
      // n1.reverse(n1).show();
        //N0.reverse(n4).show();
        n4.reverseList(n1).show();
        n4.sort(n1);

    }
}
