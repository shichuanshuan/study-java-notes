public class ArrayCopy {
	public static void main(String[] args) {
		// 将 int[] arr1 = {10, 20, 30}; 拷贝到 arr2 数组
		// 要求数据空间是独立的
		int arr1[] = {10, 20, 30};

		// 创建一个新的数组 arr2，开辟新的数据空间
		// 大小 arr1.length;
		int arr2[] = new int[arr1.length];

		// 遍历 arr1，把每个元素拷贝到 arr2 对应的元素位置
		for ( int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr2[0] = 100;

		System.out.println(" ==== this is arr1 element ====");
		for ( int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println(" ==== this is arr2 element ====");
		for ( int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}
}