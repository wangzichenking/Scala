package com.scala.chapter05
import scala.beans.BeanProperty

object Attribute {
    def main(args: Array[String]): Unit = {
        //构建对象
        val manager = new Manager("wang")
        println(manager)
        manager.setAge(21)
        println(manager.getAge())
    }
}


class Manager(val name:String){
    @BeanProperty var age:Int = _
}