// public class Calculator {
//     public static int calculate(char op, int a, int b) {
//     	if(op == '+'){
//     		return a + b;
//     	}
//     	return 0;
//     }
// }

// public class Program {
	
// 	public static void main(String[] args) {
// 		int a = 0;
//         char op = ' ';
//         int b = 0;

//         a = 3;
//         op = '+';
//         b = 7;

// 		Calculator calculator = new Calculator();
//         int result = calculator.calculate(op, a, b);
//         System.out.println(result);
	
	
// 	// public static int getInt() {
// 	// 	Scanner iScanner = new Scanner(System.in);
// 	// 	System.out.printf("int k: ");
// 	// 	int k = 0;
// 	// 	if (iScanner.hasNextInt()) {
// 	// 		k = iScanner.nextInt();
// 	// 	}
// 	// 	iScanner.close();
// 	// 	return k;
// 	}
// }

class Calculator {
    public int calculate(char op, int a, int b) {
    	if(op == '+'){
    		return a + b;
    	}
    	else return 0;
      // Введите свое решение ниже


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}