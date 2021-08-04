package day09_method;

public class Ex05 {
	public static void main(String[] args) {

		Ex05_method ex = new Ex05_method();

		int s = ex.Sum(10, 20);
		System.out.println("╣нгу : " + s);
		ex.test(2);
		System.out.println("=============");
		
		String str =ex.test02();
		System.out.println(str);
		System.out.println(ex.test02());
		
		
		
	}
}
