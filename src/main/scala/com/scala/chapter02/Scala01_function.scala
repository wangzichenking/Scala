package com.scala.chapter02
object Scala01_function {
  def main(args: Array[String]): Unit = {
    printMsg()
    println(sum1(3,5))
    print(sum2(5,2))

    /*
    函数返回值类型总结：
      1.如果明确无返回值，则可以采用Unit声明，等同于java中的void
      2.如果函数体采用return关键字返回结果，则函数在声明时应该增加返回值类型
        2.1若是返回值类型为unit，则return关键字会忽略
      3.如果函数明确没有返回值，unit可以省略但是最好不要这么做
      4.如果函数省略返回值类型，则函数体中不能显示调用return，函数体会根据最后一行代码自动推断返回值类型
     */
  }
  def printMsg(){
    println("函数声明")
  }

  //如果函数未明确返回值，则函数体中return是不起作用的
  def sum1(a:Int,b:Int): Int={
    return a+b
  }

  def sum2(a:Int,b:Int)={
    //return a+b
    a+b
  }
}
