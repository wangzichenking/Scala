package com.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object javaCollection {
    def main(args: Array[String]): Unit = {
        //scala和java集合相互转换
        var arr2 = ArrayBuffer("1","2","3")
        import scala.collection.JavaConversions.bufferAsJavaList
        val javaArr = new ProcessBuilder(arr2)
        println(javaArr.command())
        
        //--------------------------------------------------------
        import scala.collection.JavaConversions.asScalaBuffer
        val scalaArr: mutable.Buffer[String] = javaArr.command()
        println(scalaArr)
        
        for(item <- scalaArr){
            println(item)
        }
    }
}
