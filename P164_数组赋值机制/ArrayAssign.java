public class ArrayAssign {
	public static void main(String[] args) {
		// ����Ĭ������������ô��ݣ�����ֵ�ǵ�ַ
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;

		arr2[0] = 80;

		// ���� arr1 ��ֵ
		System.out.println(" ==== arr1 ��Ԫ�� ====");
		for ( int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// go Ҳ���������
	}
}