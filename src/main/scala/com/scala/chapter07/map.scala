package com.scala.chapter07

import scala.collection.mutable

object map {
    def main(args: Array[String]): Unit = {
        
       //创建映射集合，构建Map集合时，集合中的元素其实是Tuple类型
        val map1 = Map("wang"->10 ,"zi"-> 20)
        println(map1)
        
        //创建可变映射集合Map
        val map2 = mutable.Map("wang"->10 ,"zi"-> 20)
        println(map2)
        
        //空的映射
        val map3 = new mutable.HashMap[String,Int]()
        println(map3)
        
        //使用元组的方式构建Map集合
        val map4 = mutable.Map(("A",1),("B",2),("C",3))
        println(map4)
        println(map4("B"))
        if (map4.contains("D")){
            println(map4("D"))
        }else{
            println("ERROR")
        }
        //--------------------------------------
        println(map4.get("C").get)
        println(map4.getOrElse("CC",100))
        
        //更新集合中的数据
        map4("A") = 20
        println(map4.get("A"))
        
        map4 += ("D" -> 4)
        println(map4)
        
        //循环遍历map
        for ((k,v) <- map4){
            print(k+"="+v+"\t")
        }
        for (k <- map4.keys){
            print(k)
        }
    }
}
