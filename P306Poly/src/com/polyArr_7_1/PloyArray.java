package com.polyArr_7_1;

public class PloyArray {
    public static void main(String[] args) {
        // 升级应用实例：如何调用子类特有的方法，比如：
        // Teacher 有一个 teach, Student 有一个 study 怎么调用

        com.polyArr_7_1.Person[] people = new com.polyArr_7_1.Person[5];
        people[0] = new Person("jack", 20);
        people[1] = new com.polyArr_7_1.Student("marry", 18, 100);
        people[2] = new Student("smith", 19, 31.1);
        people[3] = new com.polyArr_7_1.Teacher("scott", 30, 20000);
        people[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < people.length; i++) {
            // people 编译类型时 Person，运行类型是根据实际情况由 JVM 来判断
            System.out.println(people[i].say());

            if (people[i] instanceof Student) {
                Student stu = (Student)people[i]; // 向下转型
                stu.study();
                // 也可以使用一条语句 ((Student)people[i]).study();
            } else if (people[i] instanceof Teacher) {
                Teacher tea = (Teacher)people[i];
                tea.teach();
            } else if (people[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误");
            }
            System.out.println();
        }
    }
}
