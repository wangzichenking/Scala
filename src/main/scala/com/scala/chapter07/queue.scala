package com.scala.chapter07

import scala.collection.mutable

object queue {
    def main(args: Array[String]): Unit = {
        
        //队列
        val q = new mutable.Queue[Int]
        //追加元素
        q += 1
        //追加集合元素
        q ++= List(2,3,4)
        q ++= Array(10,11,12)
        //删除元素
        for (i <- 1 to 4) q.dequeue()
        //增加元素
        q.enqueue(9,8,7)
        println(q)
        //头部
        println(q.head)
        //尾部
        println(q.last)
        //除了头部后的其他所有数据的集合
        println(q.tail)
    }
}
