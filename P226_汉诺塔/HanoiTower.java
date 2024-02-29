 public class HanoiTower {
    public static void main(String[] args) {
        T obj = new T();

        obj.move(2, 'A', 'B', 'C');
    }
}

class T {
    // num ��ʾҪ�ƶ��ĸ�����a, b, c �ֱ��ʾ A��, B��, C��
    public void move(int num, char a, char b, char c) {
        // ���ֻ��һ���� num = 1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            // ����ж���̣����Կ���������������ĺ������������
            // (1) ���ƶ��������е��̵� b������ c
            move(num - 1, a, c, b);

            // (2) �������������̣��ƶ��� c
            System.out.println(a + "->" + c);

            // (3) �ٰ� b ���������̣��ƶ��� c,���� a
            move(num - 1, b, a, c);
        }
    }
}