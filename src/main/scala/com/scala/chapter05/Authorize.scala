package com.scala.chapter05

object Authorize {
    /*
    scala中受保护的权限(protected)更加严格，只能子类访问同包不能访问
     */
    def main(args: Array[String]): Unit = {
        val house = new House
        val childHouse = new ChildHouse
        println(childHouse.test(2))
        println(house.name)
    }
}

class House{
    //添加包访问权限
    private[chapter05] var name = "big"
}

class ChildHouse extends House {
    def test(i:Int): Int ={
        i
    }
}

import java.util.{HashMap=>javaMap}
