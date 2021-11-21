package level1.NiuKe.scala

object QueShiShuZhi {

  def main(args: Array[String]): Unit = {

    val ints: Array[Int] = Array(0,2)


    def FindNumber(ints:Array[Int]):Int = {

      var left = 0
      var right = ints.length-1

      while(left<=right) {
        var mid = left+(right-left)/2

        if(mid>=ints(mid)) {
          left = mid + 1
        }else {
          right = mid - 1
        }
      }
      ints(left)
    }

    println(FindNumber(ints))


  }

}
