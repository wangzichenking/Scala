package com.scala.chapter01

//scala是完全面向对象的语言，没有静态的语法操作,采用object类代替静态操作
object HelloScala {
  //mian方法
  def main(args: Array[String]): Unit = {
    print("Hello Scala\n")
    HelloScala.pring()
  }

  def pring():Unit = {
    //函数体
    print("Hello Java")
  }
}
