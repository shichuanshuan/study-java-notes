/*
ʹ��ϸ��
3. �� java �У�char ������һ�������������ʱ���� unicode ���ж�Ӧ���ַ�; char ռ�����ַ�

*/
public class Char02 {
	public static void main(String[] args) {
		char c1 = 97;
		System.out.println(c1); // 1

		char c2 = 'a'; // ��� 'a' ��Ӧ������
		System.out.println((int)c2);

		char c3 = '��';
		System.out.println((int)c3); // 38889

		char c4 = 38889;
		System.out.println(c4); // ��

		// char �����ǿ��Խ�������ģ��൱��һ�������� ��Ϊ������Ӧ�� unicode ��
		System.out.println('a' + 10);
	}
}