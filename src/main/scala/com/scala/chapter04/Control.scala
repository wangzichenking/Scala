package com.scala.chapter04
import util.control.Breaks._
object Control {
    def main(args: Array[String]): Unit = {
        //逻辑判断if else
        val value = 1
        /*
        如果判断逻辑中返回的结果类型相同，则变量结果类型能够自动推断出来
        若是结果类型不相同，会设定类型为Any
         */
        if (value==1) println(value)
        else println("no")
        //---------------------------------
        /*
        for循环:范围数据的循环
        to:左右都包含
        until：左边包含，右边不包含
         */
        for (i <- 1 to 5){
            println(i)
        }
        for (i <- 2 until 8){
            println(i)
        }
        //循环守卫
        for (i<- 1 to 3 if i!=2){
            println(i)
        }
        for (i<-1 to 3;j<-1 to 3){
            println(i,j)
        }
        //循环产生新的集合
        var list = for(i<- 1 to 10) yield i
        println(list)
        //---------------------------------
        /*
        可中断函数
        函数的参数列表声明可以使用大括号来代替小括号
        将一段逻辑代码作为参数传给另外一个方法，为高阶函数
        break方法就是抛出异常，让breakable方法返回
         */
    
        var n = 1
        breakable(
            while (n<=20) {
                n += 1
                if (n == 18) {
                    break()
                }
            }
        )
        println(n)
    }
}
