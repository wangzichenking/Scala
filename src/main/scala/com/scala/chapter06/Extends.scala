package com.scala.chapter06

object Extends {
    def main(args: Array[String]): Unit = {
        
        //子类可以继承父类的属性和方法
        val emp = new Emp("wzc")
        emp.name="wangzichen"
        println(emp.name)
        println(emp.test())
        
        val s = "wzc"
        println(s.getClass.getName)
        
        val obj:Person = new student("zhangsan")
        //printno(obj)
        println(obj.name)
    }
    def printno(p:Person): Unit ={
        if (p.isInstanceOf[Emp]){
            val emp = p.asInstanceOf[Emp]
            println(emp.empno)
        }else if (p.isInstanceOf[student]){
            val student = p.asInstanceOf[student]
            println(student.stuno)
        }
        println(p)
    }
}

class Person(pname:String){
    var name:String = pname
    def test(): String ={
        "123"
    }
}

class Emp(empname:String) extends Person(empname){
    
    var empno:Int = 20
    override def test(): String = {
        "456"
//        super.test()
    }
}

class student(stuname:String) extends Person(stuname){
    var stuno:Int = 100
    override def test(): String ={
        "789"
    }
}
