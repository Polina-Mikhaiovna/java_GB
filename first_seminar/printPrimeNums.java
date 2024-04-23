import java.util.Arrays;

public class Answer{ 
    public static void main(String[] args) {
      printPrimeNums();
    }
// Алгоритм Решето Эратосфена
    public static void printPrimeNums(){
        int N = 1000;
        int[] primes = new int[N];
        primes = fillArray(primes, N);
        primes[1] = 0;
        int i = 2;
        int j = 0;
        while (i < N){
            if (primes[i] != 0) {
                j = i + i;
                while (j < N) {
                    primes[j] = 0;
                    j = j + i;
                }
            
            }
            i += 1;
        }
        int count = 0;
        for(int b = 0; b < N; b++){
            if (primes[b] != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int a = 0;
        for(int k = 0; k < N; k++){
            if(primes[k] > 0){
                array[a] = primes[k];
                a++;
            } 
        }
        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(list.toArray()));
        // Напишите свое решение ниже

    }
    public static int[] fillArray(int[] arr, int len) {
        
        for (int i = 0; i < len; i++) {
            arr[i] = i;
    }
    return arr;
  }
}