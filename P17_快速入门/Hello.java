// 1. public class Hello 表示 Hello 是一个类，是一个 public 公有的类
// 2. Hello{ } 表示类的开始和结束
// 3. public static void main(String[] args) 表示一个主方法，即我们程序的入口
// 4. main() {} 表示方法的开始和结束
// 5. System.out.println("hello world") 表示输出到屏幕
// 6. ; 表示语句结束

public class Hello{

	// 编写一个 main 方法
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}

/*
开发步骤
1. 将 java 代码编写到扩展名为 Hello.java 的文件中
2. 通过 javac 命令对该 java 文件进行编译，生成 .class 文件。
注意：当无法生成 .class 文件时，可能是命令栏编码格式，和当前编译器保存的编码格式不同导致的

3. 通过 java 命令对生成的 class 文件进行运行。
命令: java Hello 不是 java Hello.clase; 因为是对 Hello 这个类运行，所以不需要加上 .clase

*/