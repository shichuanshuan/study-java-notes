public class ConstructorDetail01 {
	public static void main(String[] args) {
		Person p1 = new Person("king", 40);
		Person p2 = new Person("shics");
	}
}

class Person {
	String name;
	int age;
	// 细节1 一个类可以定义多个不同的构造器，即构造器重载
	// 第 1 个构造器
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	// 第 2 个构造器, 只指定人名，不需要指定年龄
	public Person(String pName) {
		name = pName;
	}
}