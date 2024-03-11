// Задана натуральная степень k. Сформировать случайным образом
//список коэфициентов (от 0 до 100) многочлена заданной степени.

import java.util.Scanner;
import java.util.Random;

public class Program {
	
	public static void main(String[] args) {
		int k = getK();
		System.out.println(k);
		int[] coefficients = new int[k];
		coefficients = random(coefficients);
		printIntArray(coefficients);
		printPolinom(coefficients);
	}
	
	public static int getK() {
		Scanner iScanner = new Scanner(System.in);
		System.out.printf("int k: ");
		int k = 0;
		if (iScanner.hasNextInt()) {
			k = iScanner.nextInt();
		}
		iScanner.close();
		return k;
	}
	
	public static int[] random(int[] randomAarray) {
		Random r = new Random();
		for (int i = 0; i < randomAarray.length; i++) {
			randomAarray[i] = r.nextInt(100) + 1;
		}

		return randomAarray;
	}

	public static void printIntArray(int[] array){
		for(int i = 0; i < array.length; i++)
			System.out.printf("%d ", array[i]);
	}

	public static void printPolinom(int[] array){

		for (int i = 0; i <= array.length; i++) {
			if(i >= 1){
				if(array[i] == 1){
					System.out.printf("x**%d", i);
					continue;
				}
				
			}
			else System.out.printf("%d = 0", array[i]);
		}
	}
}
