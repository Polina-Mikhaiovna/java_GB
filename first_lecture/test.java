import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		var a = 123;
		System.out.println(a); // 123
		var d = 123.456;
		System.out.println(d); // 123.456
		System.out.println(getType(a)); // Integer
		System.out.println(getType(d)); // Double
		d = 1022;
		System.out.println(d); // 1022
		System.out.println(getType(d));
		a = a-- - a--;
		System.out.println(a);

		Scanner iScanner = new Scanner(System.in);
		System.out.printf("int a: ");
		boolean flag = iScanner.hasNextInt();
		System.out.println(flag);
		int i = iScanner.nextInt();
		System.out.println(i);
		iScanner.close();

//d = "mistake";
//error: incompatible types:
//String cannot be converted to double
	}
	static String getType(Object o){
		return o.getClass().getSimpleName();
	}
}
