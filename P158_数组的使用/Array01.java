public class Array01 {
	public static void main(String[] args) {
		// 方式1 动态初始化
		int a[] = new int[5];

		// 方式2
		double scores[]; // 声明数组，这时 scores 是 null，调用会出错
		scores = new double[5];

		// 方式3 静态初始化
		int array1[] = {2, 3, 6, 7, 9};
	}
}