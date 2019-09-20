package com.scala.chapter05

object ScalaObject {
    def main(args: Array[String]): Unit = {
         //构造对象时，会执行主构造函数
       val emp1 = new Emp1("wang")
        val emp2 = new Emp2("wangzichen",22)
        //-----------------------------------------------
       //使用伴生对象的apply方法构建对象
        val s1 = student()
        val s2 = student("wang",22)
        println(s2)
    }
}

class student {
}
object student{
    def apply(): student = new student()//采用单例模式来实现
    def apply(name:String,age:Int): student = new student()
}
//------------------------------------------------------------------
class Emp1(name:String){
    //构造方法体
    println("name："+name)
}
class Emp2(name:String,age:Int){
    //println(name+","+age)
    //辅助构造器,不能直接构建对象，需要调用主构造器调用对象
    def this(){
        this("zichen",11)
    }
}
