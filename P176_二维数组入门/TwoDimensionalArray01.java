public class TwoDimensionalArray01 {
	public static void main(String[] args) {
		/*
		���ö�ά�����������ͼ��
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/

		// ʲô�Ƕ�ά����
		// 1. �Ӷ�����ʽ�Ͽ� int[][]
		// 2. ����������⣬ԭ����һά�����ÿ��Ԫ����һά���飬�͹����˶�ά����
		int[][] arr = {
			{0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0},
			{0, 2, 0, 3, 0, 0},
			{0, 0, 0, 0, 0, 0}
		};

		// �����άͼ��
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println(); // ����

		}
	}
}