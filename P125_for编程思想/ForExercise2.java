public class ForExercise2 {
	public static void main(String[] args) {
		// 化繁为简
		// (1) 先输出 0-5
		// (2) 后面的 + 是 5 - i
		// for ( int i = 0; i <= 5; i++) {
		// 	System.out.println(i + "+" + ( 5 - i ) + "=5");
		// }


		// 先死后活
		// (1) 5 替换成变量 n

		int n = 9;
		for ( int i = 0; i <= n; i++) {
			System.out.println(i + "+" + ( n - i ) + "=" + n);
		}
	}
}