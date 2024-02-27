public class Object01 {
	public static void main(String[] args) {
		// 使用 OOP 面向对象解决
		// 1. new Cat() 创建一只猫
		// 2. Cat cat1 = new Cat(); 把创建的猫赋给 cat1
		// 3. cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		System.out.println("第1只猫信息 " + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第2只猫信息 " + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

// 定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	String name;
	int age;
	String color;
}