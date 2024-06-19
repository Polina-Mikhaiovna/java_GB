import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;

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
		getInputString("ведите пример");
		
		public static String getInputString(String message) {
			Scanner sc = new Scanner(System.in);
        	System.out.println(message);

      	    if (sc.hasNextLine()) {
      	        String str = sc.nextLine();
                System.out.println("Спасибо! Вы ввели " + str);
      	    } else {
           		System.out.println("Извините, перезапустите программу и попробуйте снова!");
        	}
        	sc.close();
        	return str;


//d = "mistake";
//error: incompatible types:
//String cannot be converted to double
	}
	static String getType(Object o){
		return o.getClass().getSimpleName();
	}

// 	public static char getChar(String message) {
// 		System.out.printf(message);
// 		int ch = 0;
// 		try (InputStreamReader reader = new InputStreamReader(System.in)) {
// 			ch = reader.read();
// 		}
// 		catch(IOException ex){
//             System.out.println(ex.getMessage());
//         }
		
// 		return (char)ch;

// }
}
