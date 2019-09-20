package com.scala.chapter07

object DImArray {
    def main(args: Array[String]): Unit = {
        //多维数组
        var arr = Array.ofDim[Double](3,4)
        println(arr(2)(2))
    }
}
