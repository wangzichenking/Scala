package com.scala.chapter07

object Scala_Match {
    def main(args: Array[String]): Unit = {
        
        //模式匹配，类似于java中的switch语法
/*        var result = 0
        val c = "/"
        c match {
            case "-" => result =1
            case "+" => result =2
            case "*" => result =3
            case _ if (c.toString.equals("/")) => println("/")
            //都不满足执行case _
            case _ => result =66
        }
        println(result)*/
        //---------------------------------------
/*        val str = "+-3!"
        for (i <- str.indices){
            var sign = 0
            var digit = 0
            str(i) match{
                case '+' => sign = -1
                case '-' => sign = 1
                case ch if Character.isDigit(ch) => digit = Character.digit(ch,10)
                case _ => sign = 66
            }
            println(sign+"   "+digit)
        }*/
        
        //匹配数组
/*       for (arr <- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1))){
           val result = arr match {
               case Array(0) => "0"
               case Array(x,y) => x + "=" + y
               case Array(0,_*) => "以0开头"
               case _ => "什么都不是"
           }
           println(result)
       }*/
        
        //---------------------------------------
        //列表匹配
        for (list<- Array(List(0),List(1,0),List(0,0,0),List(1,0,0))){
            val result = list match {
                case 0 :: Nil => "0"
                case x::y::Nil => x+"="+y
                case 0::tail => "0..."
                case _ => "something else"
            }
            println(result)
        }
    }
}
