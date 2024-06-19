// public class Calculator {
//     public static int calculate(char op, int a, int b) {
//     	if(op == '+'){
//     		return a + b;
//     	}
//     	return 0;
//     }
// }
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		int a = 0;
        char op = ' ';
        int b = 0;

        String task = getInputString("Enter task: ");
        String[] numbers = parseString(task);

		a = Integer.parseInt(numbers[0]);
        op = task.charAt(numbers[0].length());
        b = Integer.parseInt(numbers[1]);

		Calculator calculator = new Calculator();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
	}
	
		public static String getInputString(String message) {
			Scanner sc = new Scanner(System.in);
        	System.out.printf(message);
        	String str = "7+3";
      	    if (sc.hasNextLine()) {
      	        str = sc.nextLine();
      	    } else {
           		System.out.println("Извините, перезапустите программу и попробуйте снова!");
        	}
        	sc.close();
        	return str;
        }

        public static String[] parseString(String task) {
        	
        	String str = task;
        	//String[] operators = new String[] {"-","\\+","/","\\*"};
			String[] numbers = str.split("[\\+-/\\*]");
        	return numbers;
        }
}


class Calculator {
    public float calculate(char op, int a, int b) {

    float answer = 0;
    if(op == '+'){
        answer = sum(a,b);
    }
    else if(op == '-'){
        answer = dif(a,b);
    }
    else if(op == '/'){
        answer = div(a,b);
    }
    else if(op == '*'){
        answer = mult(a,b);
    }
    else {
        System.out.printf("%s: '%s'\n", "Некорректный оператор", op);
    }
    return answer;
    }

    public static float sum(int a, int b){
    	return (float)a + b;
    }

    public static float dif(int a, int b){
    	return (float)a - b;
    }
    public static float div(int a, int b){
    	if (b == 0) {
    		return -1;
    	}
    	else return (float)a / b;
    }
    public static float mult(int a, int b){
    	return (float)a * b;
	}
}

class Printer{ 
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
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}