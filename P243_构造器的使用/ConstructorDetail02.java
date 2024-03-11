public class ConstructorDetail02 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
	}
}

class Dog {
	// 如果程序员没有定义构造，系统会自动给类生成一个默认无参构造器（也叫默认构造器）
	/*
		默认构造器
		使用 javap 指令 反编译看看； javap Dog.class
		Dog() {
		
		}
	*/

	// 一旦定义来自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，
	// 除非显示的定义一下，即：Dog() {} 这点很重要
	public Dog(String dName) {
		// 此时不能使用 Dog dog1 = new Dog(); 定义了
		// 要使用 Dog dog1 = new Dog("shics"); 来定义
	}

	Dog() { // 显示的定义一下 无参构造器
		
		}
}