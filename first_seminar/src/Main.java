import java.time.LocalDateTime;


public class Main {
    public static float answer = 0;
	public static void main(String[] args) {
		System.out.println(getCurentDateTime());
		if (calculate('5', 3, 0) == false) System.out.println(answer);
	}
	
	public static LocalDateTime getCurentDateTime() {
    	return LocalDateTime.now();
    }

    public static boolean calculate(char op, int a, int b) {
      // Введите свое решение ниже
      boolean error = false;
      if(op == '+'){
        answer = sum(a,b);
      }
      else if(op == '-'){
        answer = dif(a,b);
      }
      else if(op == '/'){
        answer = div(a,b);
        if (answer == -1) error = true;
      }
      else if(op == '*'){
        answer = mult(a,b);
      }
      else {
        System.out.printf("%s: '%s'\n", "Некорректный оператор", op);
        error = true;
      }
      return error;
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