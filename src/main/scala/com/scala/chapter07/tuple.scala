package com.scala.chapter07

object tuple {
    def main(args: Array[String]): Unit = {
        
        /*
        scala可以将多个无关的数据封装成一个整体为元组
        元组中的数据最多存放22个
        访问元组中的数据，可以通过索引访问，也可以采用顺序号(_1)
         */
        var t1= (1,2,"wang",true)
        println(t1)
        println(t1._4)
        //循环元组
        for (item <- t1.productIterator){
            println(item)
        }
    }
}
