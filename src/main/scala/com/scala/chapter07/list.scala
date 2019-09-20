package com.scala.chapter07

object list {
    def main(args: Array[String]): Unit = {
        
        //创建列表数据，默认为不可变的集合
        val list1 = List(1,2,3,4)
        
        //创建空列表
        val list2 = Nil
        println(list1)
        println(list2)
        
        //向列表中增加元素，集合本身不变，会产生新的列表对象
        //:+ 运算符表示在列表的最后添加数据
        val list3 = list1 :+ 4
        println(list3)
        
        //+: 表示在列表的前面添加数据
        val list4 = 100 +: list1
        println(list4)
        
        //使用::来创建集合，::可以向集合中添加元素，但集合对象一定要放置在最右边，运算规则从右向左
        val list5 = 1 :: 2 :: 3 :: list1 :: Nil
        val list6 = 1 :: 2 :: 3 :: list1
        val list7 = list1 :: 1 :: 3 :: 4 :: Nil
        println(list5)
        println(list6)
        println(list7)
    }
}
