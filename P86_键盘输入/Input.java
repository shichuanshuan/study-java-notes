import java.util.Scanner; // ��ʾ�� java.util �µ� Scanner �ർ��
public class Input {
	public static void main(String[] args) {
		// ����
		// Scnner �� ��ʾ ���ı�ɨ�������� java.util ��
		// 1. ���� Scanner �����ڵİ�
		// 2. ���� Scanner ����new ����һ���������
		// myScanner ���� Scanner ��Ķ���
		Scanner myScanner = new Scanner(System.in);

		// 3. �����û����룬ʹ����ط���
		System.out.println("����������");
		String name = myScanner.next();

		System.out.println("����������");
		int age = myScanner.nextInt();

		System.out.println("�����нˮ");
		double sal = myScanner.nextDouble();

		System.out.println("�˵���Ϣ����");
		System.out.println("���� " + name + " ����=" + age + " нˮ=" + sal);
	}
}