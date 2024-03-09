public class VarScope01 {
	public static void main(String[] args) {
		// 1. 在 java 编程中，主要的变量就是属性和局部变量
		// 2. 
		// 3. 
		
	}
}

class Cat {
	double weight;

	// 4. 全局变量可以不赋值，直接使用，因为有默认值。局部变量必须赋值后才能使用，因为没有默认值
	public void cry() {
		int n = 10;
		// int n; 不赋值会出错
		System.out.println(weight);
		System.out.println(n);
	}
}