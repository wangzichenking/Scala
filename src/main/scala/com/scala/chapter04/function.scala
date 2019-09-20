package com.scala.chapter04

object function {
    def main(args: Array[String]): Unit = {
        
        //声明函数
        //scala语法中任何的语法结构都可以嵌套其他语法结构
/*        def result(i:Int)={
            if(i==1){
                i
            }else{
                println("wrong")
            }
        }*/
        //如果函数声明参数，则在调用时，必须传递参数
/*        val r = result(1)
        println(r)*/
        
     /*   def sum(num1:Int=1,num2:Int):Int={
            return num1+num2
        }
        println(sum(num2 = 3))*/
        
        //可变参数
/*        def sum(is:Int*):Int={
            var result = 0
            for (i <- is){
                result = result + i
            }
            return result
        }
        println(sum(1,2,3,4,5,6))*/
        
        //递归函数
        //递归函数不能省略返回值类型
/*        def f(n:Int):Int={
            if (n==0) 1
            else
            n * f(n-1)
        }
        println(f(5))*/
//        如果函数声明时没有返回值类型，则函数会根据最后一行代码推断返回值类型
//        如果函数声明时没有返回值类型并且同时没有使用等号声明，则函数不会推送最后一行代码
        
        //异常处理
/*        try {
            val num = 10/0
        }catch {
            case ex:ArithmeticException=>println("ArithmeticException")
            case ex:Exception=>println("Exception")
        }finally {
            println("finally...")
        }
        
        @throws(classOf[NumberFormatException])
        def f(): Unit ={
            "abc".toInt
        }
        f()*/
    }
}
