public class Pyramid {
	public static void main(String[] args) {
		String fu = "";
		String space = "";
		int le = 9;

		for ( int i = 0; i < le; i++) {
			space = "";

			for ( int j = le/2; j >= i; j--) {
				space += " ";
			}
	
			fu += "*";
			System.out.println(space + fu + space);
	
		}
	}
}