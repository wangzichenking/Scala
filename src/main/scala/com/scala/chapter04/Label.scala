package com.scala.chapter04

object Label {
  def main(args: Array[String]): Unit = {
    //声明变量
    var user$name = "wang"
    //scala中如果标识符以运算符开头，则后面全部都要跟运算符
    var +-*/ = "zi"
    var `true` = "123"
    println(+-*/)
    println(`true`)
  }
}
