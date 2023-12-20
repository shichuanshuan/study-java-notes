// char 基本使用
public class Char01 {
	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97; // 说明：字符类型可以直接存放一个数字

		// 删除快捷键 ctrl + shift + k
		// 复制快捷键 ctrl + shift + d
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); // 当输出 c4 时候，会输出 97 表示的字符 => 编码的概念
	}
}