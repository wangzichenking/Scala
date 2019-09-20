package com.scala.chapter05

import com.scala.chapter05

object Class {
    def main(args: Array[String]): Unit = {
        val outerClass1 = new ScalaOuterClass()
        val outerClass2 = new ScalaOuterClass()
        
        //scala创建内部类的方式和java不一样，将new关键字放置在前，使用对象.内部类的方式创建
        val innerClass1 = new outerClass1.ScalaInnerClass()
        val innerClass2 = new outerClass2.ScalaInnerClass()
        
        val staticInner = new chapter05.ScalaOuterClass.ScalaStaticInnerClass()
        println(staticInner)
    }
}

class ScalaOuterClass{
    
    //给外部类对象声明别名
    outer =>
    //内部类访问外部类的变量
    class ScalaInnerClass{
//        def info = println("name："+ScalaOuterClass.this.name)
        def info = println("name："+outer.name)
    }
    val name:String = "wangzichen"
    
    //在方法声明上，如果使用外部类#内部类的方式，表示忽略内部类的对象关系，等同于java中的语法操作
    def test(ic:ScalaOuterClass#ScalaInnerClass): Unit ={
        println(ic)
    }
}

object ScalaOuterClass{
    class ScalaStaticInnerClass{
    
    }
}