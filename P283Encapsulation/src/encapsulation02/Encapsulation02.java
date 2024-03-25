package com.encapsulation02;

public class Encapsulation02 {
    public static void main(String[] args) {
        Person smith = new Person("smith", 20000, 50000);
        System.out.println(smith.info());
    }
}

// 封装与构造器
class Person {
    public String name;
    private int age;
    private double salary;

    // 构造器 alt + insert
    public Person() {
    }

    // 有三个属性构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        // 我们可以将 set 方法写在构造器中，这样仍然可以对属性进行限制
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name= " + name + " age=" + age + " salary=" + salary;
    }
}