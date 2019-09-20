package com.scala.chapter07

object MapFunction {
    def main(args: Array[String]): Unit = {
/*
        //创建集合
        val list = List(1,2,3)
        //声明函数(*2)
        def test(i:Int): Int ={
            i*2
        }
        //map方法可以接收一个函数作为参数
        //map方法会将集合的每一个元素作为参数传递给函数，然后将结果放置在新的集合里
        //list.map(test)
        println(list.map(_*2))*/
        //---------------------------------
        val names = List("Nick","Bob","wangzichen")
        def start(s:String):Boolean={
            s.startsWith("B")
        }
        println(names.filter(start))
    }
}
