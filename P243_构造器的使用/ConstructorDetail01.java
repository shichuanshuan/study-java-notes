public class ConstructorDetail01 {
	public static void main(String[] args) {
		Person p1 = new Person("king", 40);
		Person p2 = new Person("shics");
	}
}

class Person {
	String name;
	int age;
	// ϸ��1 һ������Զ�������ͬ�Ĺ�������������������
	// �� 1 ��������
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}

	// �� 2 ��������, ָֻ������������Ҫָ������
	public Person(String pName) {
		name = pName;
	}
}