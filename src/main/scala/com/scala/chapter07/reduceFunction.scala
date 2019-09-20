package com.scala.chapter07

object reduceFunction {
    def main(args: Array[String]): Unit = {
        //创建数据列表
        val list = List(1,2,3,4,5)
        def minus(num1:Int,num2:Int):Int={
            num1-num2
        }
        println(list.reduceLeft(minus))
    }
}
