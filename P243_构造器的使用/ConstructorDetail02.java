public class ConstructorDetail02 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
	}
}

class Dog {
	// �������Աû�ж��幹�죬ϵͳ���Զ���������һ��Ĭ���޲ι�������Ҳ��Ĭ�Ϲ�������
	/*
		Ĭ�Ϲ�����
		ʹ�� javap ָ�� �����뿴���� javap Dog.class
		Dog() {
		
		}
	*/

	// һ���������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�������
	// ������ʾ�Ķ���һ�£�����Dog() {} ������Ҫ
	public Dog(String dName) {
		// ��ʱ����ʹ�� Dog dog1 = new Dog(); ������
		// Ҫʹ�� Dog dog1 = new Dog("shics"); ������
	}

	Dog() { // ��ʾ�Ķ���һ�� �޲ι�����
		
		}
}