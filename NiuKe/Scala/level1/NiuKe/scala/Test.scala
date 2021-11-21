package level1.NiuKe.scala

import scala.sys.process._

object Test {

  def main(args: Array[String]): Unit = {

    val strs: Array[String] = Array("abc", "ab")

    print(strs(0).startsWith(strs(1)))



  }


}
