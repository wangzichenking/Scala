package com.scala.chapter06

object Trait {
    def main(args: Array[String]): Unit = {
        //给对象动态添加功能
        //scala在叠加特质时，会首先从后面的特质开始执行
        //scala中特质中，若是调用super并不是调用父特质的方法
        val mySQL = new MySQL with operate
        mySQL.insert(11)
    }
}

trait operate{
    def insert(id : Int): Unit ={
        println("插入数据---->"+id)
    }
}

abstract class MySQL {

}
/*
trait Logger{
    def log()
}

class Console extends Logger with Cloneable with Serializable {
    override def log(): Unit = {
        println("log....")
    }
}
*/