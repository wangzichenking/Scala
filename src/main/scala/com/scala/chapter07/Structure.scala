package com.scala.chapter07

object Structure {
    def main(args: Array[String]): Unit = {
/*        //隐式转换函数
        implicit def a(d:Double) =d.toInt
        val num:Int = 3.5
        println(num)*/
        //---------------------------------------------
        
/*        implicit def addDelete(mysql: Mysql):DB={
            new DB
        }
        val mysql = new Mysql
        mysql.delete()*/
        
        //---------------------------------------------
        implicit val name = "Nick"
        //声明方法，但是参数无默认值
        //如果函数调用时，没有传递参数，则可以声明implict关键字，去查找隐式值
        def hello(implicit content:String): Unit ={
            println("Hello "+content)
        }
        hello
    }
}

class Mysql{
    def insert(): Unit ={
        println("插入数据")
    }
}
class DB{
    def delete(): Unit ={
        println("删除数据")
    }
}
