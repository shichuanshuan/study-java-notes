public class MethodParameter02 {
	public static void main(String[] args) {
		B obj = new B();
		Person p = new Person();

		p.name = "jacl";
		p.age = 10;

		obj.test200(p);
		System.out.println("main p.age= " + p.age);

		System.out.println("=========== null =============");
		p.age = 10;
		obj.test300(p);
		System.out.println("main p.age= " + p.age);

		System.out.println("=========== new =============");
		p.age = 10;
		obj.test400(p);
		System.out.println("main p.age= " + p.age);
	}
}

class Person {
	String name;
	int age;
}

class B {
	public void test200(Person p) {
		p.age = 10000;
	}

	public void test300(Person p) {
		// p ÷∏œÚ¡À null
		p = null;
	}

	public void test400(Person p) {
		p = new Person();
	}
}