package com.scala.chapter07
import scala.collection.mutable.ArrayBuffer
object arraybuffer {
    def main(args: Array[String]): Unit = {
        
        //可变集合
        val arr = ArrayBuffer[Int]()
        arr.append(1,2,3)
        println(arr)
        println(arr.toArray)
    }
}
