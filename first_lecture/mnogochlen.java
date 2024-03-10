// Задана натуральная степень k. Сформировать случайным образом
//список коэфициентов (от 0 до 100) многочлена заданной степени.

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int k = getK();

		System.out.println(k);

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
	public static int[] random {
		
	}
}