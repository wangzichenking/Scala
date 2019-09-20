package com.scala.chapter07

object array {
    def main(args: Array[String]): Unit = {
        //scala中使用array作为数组使用
        //java: int a[]=new int[10]
        //声明数组
        //val arr = new Array[Int](10)
        //给元素赋值
        //arr(0) = 1
        //println(arr(0))
        
        //---------------------------------
        //创建数组,使用apply方法
        val arr = Array(1,2,3)
        for(i<- arr){
            println(i)
        }
    }
}
