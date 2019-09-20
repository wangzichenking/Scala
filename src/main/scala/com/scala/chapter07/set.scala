package com.scala.chapter07

import scala.collection.mutable

object set {
    def main(args: Array[String]): Unit = {
        
        //创建集 set
        var set = mutable.Set(1,2,3,4,5,6,7,8)
        set.add(9)
        println(set)
        
        for (item <- set){
            println(item)
        }
        
    }
}
