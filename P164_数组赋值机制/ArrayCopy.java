public class ArrayCopy {
	public static void main(String[] args) {
		// �� int[] arr1 = {10, 20, 30}; ������ arr2 ����
		// Ҫ�����ݿռ��Ƕ�����
		int arr1[] = {10, 20, 30};

		// ����һ���µ����� arr2�������µ����ݿռ�
		// ��С arr1.length;
		int arr2[] = new int[arr1.length];

		// ���� arr1����ÿ��Ԫ�ؿ����� arr2 ��Ӧ��Ԫ��λ��
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