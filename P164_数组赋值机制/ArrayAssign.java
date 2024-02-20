public class ArrayAssign {
	public static void main(String[] args) {
		// 数组默认情况下是引用传递，赋的值是地址
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;

		arr2[0] = 80;

		// 看看 arr1 的值
		System.out.println(" ==== arr1 的元素 ====");
		for ( int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// go 也是这个机制
	}
}