public class ForDetail {
	public static void main(String[] args) {
		// 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，
		// 循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
		// 使用内存分析法，掌握
		int count = 3;
		for (int i = 0, j = 0; i < count; i++, j += 2) {
			System.out.println("i= " + i + " j= " + j);
		}
	}
}