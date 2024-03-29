 public class HanoiTower {
    public static void main(String[] args) {
        T obj = new T();

        obj.move(2, 'A', 'B', 'C');
    }
}

class T {
    // num 表示要移动的个数，a, b, c 分别表示 A塔, B塔, C塔
    public void move(int num, char a, char b, char c) {
        // 如果只有一个盘 num = 1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            // 如果有多个盘，可以看出两个，最下面的和上面的所有盘
            // (1) 先移动上面所有的盘到 b，借助 c
            move(num - 1, a, c, b);

            // (2) 把最下面的这个盘，移动到 c
            System.out.println(a + "->" + c);

            // (3) 再把 b 塔的所有盘，移动到 c,借助 a
            move(num - 1, b, a, c);
        }
    }
}