package exercise;

public class exercise01 {
    public static void main(String[] args) {
        // 会输出什么
        Bb b = new Bb();
    }
}

class Aa {
    Aa() {
        System.out.println("a");
    }

    Aa(String name) {
        System.out.println("a name");
    }
}

class Bb extends Aa {
    Bb() {
        this("abc"); // 调用本类携带字符串的构造器
        System.out.println("b");
    }

    Bb(String name) {
        System.out.println("b name");
    }
}
