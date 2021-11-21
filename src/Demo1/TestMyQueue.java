package Demo1;

import UtilPack.MyQueue;

public class TestMyQueue {

    public static void main(String[] args) {
        //创建一个队列
        MyQueue mq = new MyQueue();
        mq.add(9);
        mq.add(8);

        System.out.println(mq.poll());

        mq.add(7);

        System.out.println(mq.poll());

    }
}
