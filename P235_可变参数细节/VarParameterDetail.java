public class VarParameterDetail {
	public static void main(String[] args) {
		// 细节：可变参数的实惨可以为数组
		int[] arr = {1, 2, 3};
		T t1 = new T();
		t1.f1(arr);
	}
}

class T {
	public void f1(int... nums) {
		System.out.println("length= " + nums.length);
	}

	// 细节：可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数放在最后
	public void f2(String str, double... nums) {

	}

	// 细节：一个形参列表中只能出现一个可变参数
	// public void f3(int... num1, double... num2) {

	// }
}