package com.scala.chapter02

object Scala02_function {
  def main(args: Array[String]): Unit = {
    var v2 = f2 _//在函数后面添加_，表示将函数当成类型赋值，而不会执行
    v2()()
  }
  def f1():Unit={
    println("f1--------")
  }
  def f2()={
    f1 _
  }
}
