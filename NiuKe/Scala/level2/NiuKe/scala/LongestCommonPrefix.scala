package level2.NiuKe.scala

/*
*Description：xxx<br/>
*Copyright(c),2021,SKY<br/>
*This program is protected by copyrigth laws.<br/>
*Date:2021年10月05日
*@author SKY
*@version:1.0
*/ object LongestCommonPrefix {

  def main(args: Array[String]): Unit = {

    val strs: Array[String] = Array("abc", "a")


    def longestCommonPrefix(strs: Array[String]): String = {
      var res = ""

      if (strs.length > 0) {
        res = strs(0)

        for (i <- 1 until strs.length) {

          while (!strs(i).startsWith(res)) {

            if (res.length > 1) {
              res = res.substring(0, res.length - 1)
            } else {
              return ""
            }

          }
        }
      }
      res
    }


    print(longestCommonPrefix(strs))


  }

}
