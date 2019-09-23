package com.scala.chapter07

object FoldFunction {
    def main(args: Array[String]): Unit = {
        
        //折叠
        /*
        fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算
         */
        val list = List(1,2,3,4)
        def minus(num1:Int,num2:Int):Int={
            num1-num2
        }
        println(list.foldLeft(5)(minus))
    }
}
