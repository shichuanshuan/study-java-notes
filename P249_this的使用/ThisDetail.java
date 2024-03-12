public class ThisDetail {
	public static void main(String[] args) {
		T t1 = new T();
		t1.f2();
	}
}

class T {
	/* 
	细节4：访问构造器语法：this(参数列表)；
	注意只能在构造器中使用(即只能在构造器中访问另外一个构造器)

	注意: 访问构造器语法：this(参数列表); 必须放置第一条语句
	*/

	public T() {
		// 这里去访问 T(String name, int age)
		this("jack", 100);

		System.out.println("T() 构造器");
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器");
	}


	// 细节3：访问成员方法的语法： this.方法名(参数列表)
	public void f1() {
		System.out.println("f1() method....");
	}

	public void f2() {
		System.out.println("f2() method...");
		// 调用本类的 f1
		// 第一种方式
		f1();
		// 第二种方式
		this.f1();
	}
}