public class Constructor01 {
	public static void main(String[] args) {

		// ������ new һ������ʱ��ֱ��ͨ��������ָ�����ֺ�����
		Person p1 = new Person("smith", 23);
		System.out.println("p1 ����Ϣ����:");
		System.out.println("p1 name= " + p1.name);
		System.out.println("p1 age= " + p1.age);
	}
}

// �ڴ�������Ķ���ʱ����ֱ��ָ�������������������
class Person {
	String name;
	int age;

	// 1. ������û�з���ֵ��Ҳ����д void
	// 2. �����������ƺ��� Person һ��
	// 3. (String pName, int pAge) �ǹ������β��б�����ͳ�Ա����һ��
	public Person(String pName, int pAge) {
		System.out.println("�����������á��� ��ɶ�������Գ�ʼ��");
		name = pName;
		age = pAge;
	}
}