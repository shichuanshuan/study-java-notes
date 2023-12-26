// 自动转换细节
public class AutoConvertDetail {
	public static void main(String[] args) {
		// 细节1：有多种类型的数据混合运算时
		// 系统首先自动将所有数据类型转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		// float d1 = n1 + 1.1; // 错误 n1 + 1.1 ==> 结果类型是 double
		// float d1 = n1 + 1.1f; // 对, n1 + 1.1 => 结果类型是 double
		// double d1 = n1 + 1.1; // 对 类型就是 double

		// 细节2：当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时
		// 就会报错，繁殖就会进行自动类型转换
		// int n2 = 1.1; // 错误 double -> int

		// 细节3：(byte, short) 和 char 之间不会相互自动转换
		// 当把具体数赋给 byte 时，先判断该数是否在 byte 范围内，如果是就可以
		byte b1 = 10; // 对， -128-127
		int n2 = 1; // n2 是 int, 会在内存中分配 4 个字节
		// byte b2 = n2; // 把 4 个字节分配给 b2 1字节会错误
		// char c1 = b1; 错误，原因 byte 不能自动转换成 char

		// 细节4： byte,short, char 他们三者可以计算，在计算式首先转换为 int 类型
		byte b2 = 1;
		short s1 = 1;
		// short s2 = b2 + s1; // 错，b2 + s1 => int
		int s2 = b2 + s1; // 对

		byte b3 = 2;
		// byte b4 = b2 + b3; // 错误 b2 + b3 => int


		// 细节5：boolean 不参与运算
		boolean pass = true;
		// int num100 = pass;

		// 细节6：自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;

		double num500 = b4 + s3 + num200 + num300;

	}
}