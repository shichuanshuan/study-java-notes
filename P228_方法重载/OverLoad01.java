public class OverLoad01 {
	public static void main(String[] args) {
		// java 中允许同一个类中，多个同名方法的存在，但要求形参列表不一致
		// 好处
		// 减少了起名的麻烦
		// 减轻了记名的麻烦

		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println();
		System.out.println(mc.calculate(1.1, 2));
		System.out.println();
		System.out.println(mc.calculate(1, 2.2));
		System.out.println();
		System.out.println(mc.calculate(1, 2, 3));

	}
}

class MyCalculator {
	// 两数之和
	public int calculate(int n1, int n2) {
		System.out.println("两数之和");
		return n1 + n2;
	}

	// 一个整数，一个 double 的和
	public double calculate(int n1, double n2) {
		System.out.println("一个整数，一个 double 的和");
		return n1 + n2;
	}

	// 一个 double，一个 int 和
	public double calculate(double n1, int n2) {
		System.out.println("一个 double，一个 int 和");
		return n1 + n2;
	}

	// 三个 int 的和
	public int calculate(int n1, int n2, int n3) {
		System.out.println("三个 int 的和");
		return n1 + n2 + n3;
	}
}