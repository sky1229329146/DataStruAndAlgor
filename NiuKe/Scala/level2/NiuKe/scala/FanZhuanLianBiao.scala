package level2.NiuKe.scala
import scala.util.control.Breaks._
object FanZhuanLianBiao {

  def main(args: Array[String]): Unit = {

    class ListNode(value:Int) {
      val node_v = value                    // 设置每个节点存储的值
      var next:ListNode = null            // 设置每个节点的指针

      def append(li:ListNode):ListNode = {
        //当前节点
        var currentNode: ListNode = li

        //循环向后找


        var flag = true

          while (flag) {
            //取出下一个节点
            var nextNode: ListNode = currentNode.next
            if (nextNode == null) {
              flag = false
            }
            currentNode = nextNode

          }


          //把需要追回节点追加为找到的当前节点的下一节点

//          currentNode.next = li
          li
        }





    }

    def reverse(l1:ListNode):ListNode = {              // 参数l1:ListNode是单链表的头节点
      var l2 = l1                                    // copy l1 为 l2
      var new_header:ListNode = null        // 生成一个新的头节点 header Node

      while(l2 != null) {                                 // 循环遍历 l2 中是否为空
        val current_node = l2.next              // 记录一下l2的下一个节点
        l2.next = new_header                     //  把新的header节点连接到l2的下一个节点上
        new_header = l2                             // 让新生成的节点指向l2
        l2 = current_node                           // 让l2指向下一个节点
      }
      new_header                                         // 返回新的头节点new_header，也就是返回反转后的单链表
    }




    val li = new ListNode(1)
    val lii = new ListNode(2)
    val liii = new ListNode(3)

     li.append(lii)


    println(li.next.node_v)
    println(lii.node_v)
    println(liii.node_v)

   // println(reverse(li).node_v)




  }




}
