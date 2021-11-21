package level1.NiuKe.scala

import scala.io.StdIn

object Panduanhuiwen {

  def main(args: Array[String]): Unit = {

    println("please write a sequeue chars")

    val str: String = StdIn.readLine()

    if(str.reverse==str) {
      print("true")
    }else {
      print("false")
    }




  }

}
