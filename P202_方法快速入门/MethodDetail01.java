public class MethodDetail01{
	public static void main(String[] args) {
		AA aa = new AA();
		int[] res = aa.getSumAndSub(1, 3);
		System.out.println("Sum= " + res[0]);
		System.out.println("Sub= " + res[1]);
		System.out.println("=========================");

		double val = aa.returnValue();
		System.out.println("val= "+ val);

	}
}

// 范围修饰符有四种 [public, protected, 默认, private]
class AA {
	// 1. 一个方法最多有一个返回值
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];

		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;

		return resArr;
	}

	// 2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
	// 看 getSumAndSub

	// 3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
	// 而且要求返回值类型必须和 return 的值类型一致或兼容
	public double returnValue() {
		double d1 = 1.1 * 3;
		int n = 100;

		// return n; // int -> double 支持
		return d1;
	}

	// 4. 如果方法是 void, 则方法体中可以没有 return 语句，或者只写 return
}