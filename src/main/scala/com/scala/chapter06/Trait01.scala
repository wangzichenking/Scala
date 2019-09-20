package com.scala.chapter06

object Trait01 {
    def main(args: Array[String]): Unit = {
        var f = new F with C with D
        println(f)
    }
}

trait A{
    println("A...")
}
trait B extends A {
    println("B...")
}
trait C extends B {
    println("C...")
}
trait D extends C {
    println("D...")
}
class E{
    println("E...")
}
class F extends E {
    println("F...")
}
