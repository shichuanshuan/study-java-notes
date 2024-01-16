import java.util.Scanner; // 表示吧 java.util 下的 Scanner 类导入
public class Input {
	public static void main(String[] args) {
		// 步骤
		// Scnner 类 表示 简单文本扫描器，在 java.util 包
		// 1. 引入 Scanner 类所在的包
		// 2. 创建 Scanner 对象，new 创建一个对象，体会
		// myScanner 就是 Scanner 类的对象
		Scanner myScanner = new Scanner(System.in);

		// 3. 接收用户输入，使用相关方法
		System.out.println("请输入名字");
		String name = myScanner.next();

		System.out.println("请输入年龄");
		int age = myScanner.nextInt();

		System.out.println("请输出薪水");
		double sal = myScanner.nextDouble();

		System.out.println("人的信息如下");
		System.out.println("名字 " + name + " 年龄=" + age + " 薪水=" + sal);
	}
}