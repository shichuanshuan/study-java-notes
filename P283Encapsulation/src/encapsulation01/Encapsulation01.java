package com.encapsulation01;

public class Encapsulation01 {
   public static void main(String[] args) {
       Person person = new Person();
       person.setName("jack");
       person.setAge(123);
       person.setSalary(100000);
       System.out.println(person.info());

   }
}

/*
* 不能随便查看个人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认年龄，
* 年龄必须在 1-120，工资不能直接查看，name 的长度在 2-6 字符之间
* */

class Person {
    public String name;
    private int age;
    private double salary;

    // 要为每个字段写 set 和 get 方法，自己写太慢。使用快捷键 alt+insert

    // 然后根据要求来完善我们的代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("name length not is");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 判断是否在合理范围内
        if ( age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("age more range");
        }
    }

    public double getSalary() {
        // 可以在这里增加当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法，返回属性信息
    public String info() {
        return "信息为 name= " + name + " age=" + age + " salary=" + salary;
    }
}