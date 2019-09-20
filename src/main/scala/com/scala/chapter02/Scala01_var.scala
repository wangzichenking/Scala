package com.scala.chapter02

object Scala01_var {
  def main(args: Array[String]): Unit = {
    //声明变量(val声明的变量无法改变值，在编译之后等用于增加了final修饰)
    var username : String = "wangzichen"
    var password : Int= 123456
    username = "wangxiaozhang"
    println(password)
    println(username)
  }
}
