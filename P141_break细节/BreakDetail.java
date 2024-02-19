public class BreakDetail {
	public static void main(String[] args) {
		// breka 可以退出到指定标签位置


		lable1:
		for ( int j = 0; j < 4; j++) {
			lable2:
			for ( int i = 0; i < 10; i++) {
				if ( i == 2) {
					break; // 等价 break lable2
				}

				System.out.println("i = " + i);
			}
			
		}
	}
}