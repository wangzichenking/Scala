package com.scala.chapter07

object ScanFunction {
    def main(args: Array[String]): Unit = {
        val sentence = "AADDSSSWWWGGGDDDVVVVBBFRRRRREFVMKSDJKFNSLKL"
        //(Map,Char)
        def count(map:Map[Char,Int],c:Char):Map[Char,Int]={
            //map(c) = map.getOrElse(c,0) + 1
            map + (c -> (map.getOrElse(c,0)+1))
        }
        println(sentence.foldLeft(Map[Char,Int]())(count))
    }
}
