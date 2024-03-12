// Задана натуральная степень k. Сформировать случайным образом
//список коэфициентов (от 0 до 100) многочлена заданной степени.

import java.util.Scanner;
import java.util.Random;

public class Program {
	
	public static void main(String[] args) {
		int k = getK();
		System.out.println(k);
		int[] coefficients = new int[k+1];
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
	
	public static int[] random(int[] randomArray) {
		Random r = new Random();
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = r.nextInt(100) + 1;
		}

		return randomArray;
	}

	public static void printIntArray(int[] array){
		for(int i = 0; i < array.length; i++)
			if (i == array.length - 1) System.out.printf("%d\n", array[i]);
			else System.out.printf("%d ", array[i]);
	}

	public static void printPolinom(int[] array){
		int l = array.length;
		for (int i = 0; i < array.length; i++) {
			l--;
			if(i < array.length - 1){
				if(array[i] != 1){
					System.out.printf("%d*x**%d + ", array[i], l);
				}
				else System.out.printf("x**%d + ", l);
			}
			else System.out.printf("%d = 0\n", array[i]); // i == array.length - 1
		}
	}
}
