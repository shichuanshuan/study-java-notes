public class ForExercise {
	public static void main(String[] args) {
		// 打印 1~100 之间所有 9 的倍数的整数
		// 1. 化繁为简，将复杂的需求，拆解成简单的需求，逐步完成
		// 2. 先死后活，先考虑固定的值，然后转成可以灵活变化的值

		// 思路分析
		// 化繁为简
		// (1) 完成输出 1-100 的值
		// (2) 在输出的过程中，进行过滤，只输出 9 的倍数，i % 9 == 0
		// (3) 统计个数 定义一个变量 int count = 0； 当条件满足时 count++;
		// (4) 总和，定义一个变量 int sum = 0; 当条件满足时累计 sum += i;

		// 先死后活
		// (1) 为了适应更好的需求，把范围的开始的值和结束的值，做出变量
		// (2) 还可以更进一步， 9 倍数也做出比哪里 int  t = 9;

		int count = 0;
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if ( i % 9 == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
		}

		System.out.println("count=" + count);
		System.out.println("sum=" + sum);

	}
}