public class Method01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(7);

		int res = p1.getSum(3, 7);
		System.out.println("两数之和是 " + res);
	}
}

class Person {
	String name;
	int age;

	// 方法（成员方法）
	// 添加 speak 成员方法
	// 1. public 表示方法是公用
	// 2. void 表示方法没有返回值
	// 3. speak 方法名
	// 4. {} 方法体，可以写我们要执行的代码
	// 5. System... 表示输出一句话
	public void speak() {
		System.out.println("我是一个好人");
	}

	// 添加 cal01 方法，可以计算从 1 + ... 1000 的结果
	public void cal01() {
		int res = 0;
		for (int i = 0; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01 计算结果是= " + res);
	}

	// 添加 cal02 方法，该方法可以接收一个数 n，计算从 1+...+n 的结果
	public void cal02(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02 计算机结果是= " + res);
	}

	// 添加 getSum 方法，可以计算两个数的和
	public int getSum(int num1, int num2) {
		int res = num1 + num2;

		return res;
	}
}