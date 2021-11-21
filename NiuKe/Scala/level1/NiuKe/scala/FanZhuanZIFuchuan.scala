package level1.NiuKe.scala

import scala.io.StdIn

object FanZhuanZIFuchuan {

  def main(args: Array[String]): Unit = {

    println("please write a sequence chars")

    val str: String = StdIn.readLine()

    println(str.reverse)

  }

}
