// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Answer{ 
    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {
        n = 5;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
        // Вывод результата на экран
      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }

    public static int countNTriangle(int n){
      // Введите свое решение ниже
      int res = 0;
      if (n < 1) res = -1;
      else{
        for(int i = 1; i <= n; i++){
        }
      }
      return res;
    }
}