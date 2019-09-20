package com.scala.chapter03


class ScalaPerson extends ScalaPlay {
  /*
  scala中声明属性必须显示初始化，否则编译出错
  scala可以属性值自动推断，属性值可以省略
  若是将null作为默认值，则属性最好声明
  如果将下划线给赋值，那么等同于null
   */
  private var name = "zhangsan"
//  private var name : String = _

  def getName() :String={
    return name;
  }
  def setName(name:String) :Unit={
    this.name=name;
  }
}

//若是希望类中存在静态内容，可以使用scala中特有的伴生对象，而且伴生对象类名应该和类名相同
//伴生对象中的属性和方法可以通过类名直接调用访问
object ScalaPerson{
  var sex : Boolean = true
}

class ScalaEmp{
  /*
  在scala中，声明属性，编译器会自动添加类似于set和get方法
  若是属性声明为private访问权限，则set和get方法为private的
  若是属性不声明访问权限，则set和get方法是公共的
   */
  var name : String = _
  var age : Int = _
}

object Test{
  def main(args: Array[String]): Unit = {
    //创建对象
    val person : ScalaPerson = new ScalaPerson()
    val emp : ScalaEmp = new ScalaEmp()
    //对象类型可以省略
    println(person)
    person.setName("wangzc")
    println(person.getName())
    //set
    emp.name = "zichen"
    emp.age = 20
    //get
    println(emp.age+"\t"+emp.name)
    //println(ScalaPerson.sex)
  }
}
