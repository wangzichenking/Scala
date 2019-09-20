package com.scala.chapter03;

import lombok.Data;


@Data
public class Person {
    private String name;
}


@Data
class People{
    private int age;
}

class TestPerson{
    public static void main(String[] args) {
        Person person = new Person();
        People people = new People();
        people.setAge(18);
        person.setName("zhangsan");
        System.out.println(person.getName()+"\t"+people.getAge());
    }

}
