public class FloatDetail {
	public static void main(String[] args) {

		// java 的浮点型常量（具体值）默认为 double 型，声明 float 型常量，须后加 'f' 或 'F'
		// float num1 = 1.1;  // 对不对，错误
		float num2 = 1.1F;    // 对的
		double num3 = 1.1;    // 对
		double num4 = 1.1f;   // 对

		// 十进制数形式：如：5.12   512.0f    .215 （必须有小数点）
		double num5 = .123; // 等价 0.123
		System.out.println(num5);

		// 科学计数法形式：如：5.12e2        5.12E-2
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		// 浮点数使用陷阱：2.7  和 8.1 / 3 比较
		// 看看一段代码
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);  // 2.7
		System.out.println(num12);  // 接近 2.7 的一个小数, 而不是 2.7

		// 得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心
		// 应该是以两个数的差值的绝对值，在某个精度范围内判断

		// 正确的写法
		if (Math.abs(num11 - num12) < 0.000001) {
			System.out.println("差值非常小，到我的规定精度，认为相等....");
		}
		System.out.println(Math.abs(num11 - num12));
	}
}