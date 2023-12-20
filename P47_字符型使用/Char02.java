/*
使用细节
3. 在 java 中，char 本质是一个整数，在输出时，是 unicode 码中对应的字符; char 占两个字符

*/
public class Char02 {
	public static void main(String[] args) {
		char c1 = 97;
		System.out.println(c1); // 1

		char c2 = 'a'; // 输出 'a' 对应的数字
		System.out.println((int)c2);

		char c3 = '韩';
		System.out.println((int)c3); // 38889

		char c4 = 38889;
		System.out.println(c4); // 韩

		// char 类型是可以进行运算的，相当于一个整数， 因为它都对应有 unicode 码
		System.out.println('a' + 10);
	}
}