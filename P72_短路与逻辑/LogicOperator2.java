public class LogicOperator2 {
	public static void main(String[] args) {
		// || 短路或  和 |逻辑或
		int age = 50;
		if ( age > 20 || age < 90 ){
			System.out.println("ok100");
		}

		if ( age > 20 | age < 90 ){
			System.out.println("ok200");
		}

		// 看看区别
		// || 短路或：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高
		int a = 4;
		int b = 9;
		if ( a > 1 || ++b > 4 ){
			System.out.println("ok300");
		}
		System.out.println("|| a= " + a + "; b= " + b);

		a = 4;
		b = 9;
		if ( a > 1 | ++b > 4 ){
			System.out.println("ok300");
		}
		System.out.println("| a= " + a + "; b= " + b);
	}
}