package level1.NiuKe.scala

import scala.collection.mutable.ListBuffer

object LuoXuanJuZhen {

  def main(args: Array[String]): Unit = {


    val arr: Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6))

    def LuoXuanBianLi(arr:Array[Array[Int]]):List[Int] = {

      val str: ListBuffer[Int] = ListBuffer[Int]()

      var left = 0
      var right = arr(0).length-1
      var top = 0
      var button = arr.length - 1


      while(left<=right && top<=button){

        //遍历第一行
        for(i1<- left to right) {
          str+=arr(top)(i1)
        }
        //遍历最后一列
        for(j2<- top+1 to button){
          str+=arr(j2)(right)
        }

        if(left<right && top<button) {
          //遍历最后一行，倒数第二列到第一列
          for(i2<- (left+1 to right -1).reverse) {
            str+=arr(button)(i2)
          }
          //遍历第一列，最后一行到顺数第二行
          for(j1<- (top+1 to button).reverse){
            str+=arr(j1)(left)
          }

        }
       left+=1
        right-=1
        top+=1
        button-=1
      }
      str.toList

    }

    println(LuoXuanBianLi(arr))


  }

}
