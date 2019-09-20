package com.scala.chapter05;

public class TestJava {
    public static void main(String[] args) {

        OuterClass outerClass1 = new OuterClass();
        OuterClass outerClass2 = new OuterClass();

        //创建java中的成员内部类
        OuterClass.InnerClass innerClass1 = outerClass1.new InnerClass();
        OuterClass.InnerClass innerClass2 = outerClass2.new InnerClass();
        innerClass1.test(innerClass2);
        innerClass2.test(innerClass1);

        //创建java静态内部类
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

    }
}

class OuterClass{
    class InnerClass{
        public void test(InnerClass ic){
            System.out.println(ic);
        }
    }
    static class StaticInnerClass{
        
    }
}
