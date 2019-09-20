package com.scala.chapter07

object PianHanshu {
    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,"wzc")
/*        def add(i:Any):Any={
            i match {
                case x:Int => x+1
                case _ => i
            }
        }*/
        //偏函数
        val add = new PartialFunction[Any,Int] {
            def apply(any: Any)=any.asInstanceOf[Int]+1
    
            def isDefinedAt(any: Any) = if (any.isInstanceOf[Int]) true else false
        }
        //返回偏函数
        def f:PartialFunction[Any,Int] = {
            case i:Int => i+1//case语句会自动转换为偏函数
        }
        //println(list.collect(f))
        //最简
        println(list.collect{ case i:Int => i+1})
        
    }
}
