package com.polyArr_7;

import com.polyArr_7_1.Person;
import com.polyArr_7_1.Student;
import com.polyArr_7_1.Teacher;

public class PloyArray {
    public static void main(String[] args) {
        // 应用实例：现有一个继承结构如下：要求创建1个 Person 对象、
        // 2个 Student 对象和2个Teacher 对象，统一放在数组中，并调用每个对象 say 方法

        Person[] people = new Person[5];
        people[0] = new Person("jack", 20);
        people[1] = new Student("marry", 18, 100);
        people[2] = new Student("smith", 19, 31.1);
        people[3] = new Teacher("scott", 30, 20000);
        people[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < people.length; i++) {
            // people 编译类型时 Person，运行类型是根据实际情况由 JVM 来判断
            System.out.println(people[i].say());
        }
    }
}
