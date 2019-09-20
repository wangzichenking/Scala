package com.scala.chapter08

object Function {
    def main(args: Array[String]): Unit = {
        /*
        能够接受函数作为参数的函数是高阶函数
         */
        //声明匿名函数
        //val t = (x:String)=>println("Hello")
        //println(t)
        //----------------------------------------
        
        //声明高阶函数
/*        def test(f:Double => Double)=f(10)
        def sum(d:Double):Double={
            d+d
        }
        println(test(sum))*/
        
//        def multiple(x:Double):Double = 3*x
        val list = List(1,2,3,4)
        //println(list.map((x:Int)=>x+1))
        //println(list.map(x=>x+1))
        println(list.map(_+1))
        
        //函数柯里化
        def multiple(x:Int)(y:Int)=x*y
        println(multiple(10)(5))
        //-------------------------------------
        val a = "a"
        val aa = "A"
        def eq(s1:String,s2:String):Boolean={
            s1.equals(s2)
        }
        println(a.checkEq(aa)(eq))
    }
    
    implicit class TestEq(s:String){
        def checkEq(ss:String)(f:(String,String)=>Boolean): Boolean ={
            //把字符串变小写
            f(s.toLowerCase,ss.toLowerCase)
        }
    }
}
