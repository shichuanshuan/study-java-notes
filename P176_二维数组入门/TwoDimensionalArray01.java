public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		/*
		请用二维数组输出如下图形
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/

		// 什么是二维数组
		// 1. 从定义形式上看 int[][]
		// 2. 可以这样理解，原来的一维数组的每个元素是一维数组，就构成了二维数组
		int[][] arr = {
			{0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0},
			{0, 2, 0, 3, 0, 0},
			{0, 0, 0, 0, 0, 0}
		};

		// 输出二维图形
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println(); // 换行

		}
	}
}