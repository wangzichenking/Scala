package com.scala.chapter07

object Ext {
    def main(args: Array[String]): Unit = {
        
        //拉链
//        val list1 = List(1,2,3)
//        val list2 = List(4,5,6)
//        println(list1.zip(list2))
        //-------------------------
        //迭代器
        //val iterator = List(1,2,3,4,5).iterator
        //while(iterator.hasNext){
        //            println(iterator.next())
        //        }
//        for ( item <- iterator){
//            println(item)
//        }
        
        //------------------------------------
        //流stream
//        def numsForm(n:BigInt):Stream[BigInt]=n #:: numsForm(n+1)
//        val stream = numsForm(1)
//        println(stream)
//        println(stream.tail.head)
//        println(stream.last)
        //------------------------------------
        //视图view
        //并行
        //(1 to 5).foreach(println(_))
        //(1 to 5).par.foreach(println(_))
        
//        val result1 = (0 to 100).map{case _=> Thread.currentThread().getName}.distinct
//        val result2 = (0 to 100).par.map{case _=> Thread.currentThread().getName}.distinct
//        println(result1)
//        println(result2)
        //------------------------------------
        val ope = new operator
        ope.++()
    }
}
class operator{
    def ++() = println("123")
}