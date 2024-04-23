// 1. Задана натуральная степень k. Сформировать случайным образом
//    список коэфициентов (от 0 до 100) многочлена заданной степени.
// 2. Даны 2 файла, в каждом находится запись многочлена. Нужно
//    сформировать файл содержащий сумму многочленов.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		int k = getInt();
		int[] coefficients = new int[k+1];
		coefficients = random(coefficients);
		createFile("file1.txt", createPolinom(coefficients));
		createFile("file2.txt", createPolinom(coefficients));
		String polinomFromFile1 = getStringFromFile("file1.txt");
		String polinomFromFile2 = getStringFromFile("file2.txt");
		//parsingPolinom(polinomFromFile);
	}
	
	public static int getInt() {
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

	public static String createPolinom(int[] array){
		int l = array.length;
		String res = "";
		for (int i = 0; i < array.length; i++) {
			l--;
			if(i < array.length - 1){
				if(array[i] != 1){
					res = res + String.format("%d*x**%d + ", array[i], l);
				}
				else res = res + String.format("x**%d + ", l);
			}
			else res = res + String.format("%d = 0\n", array[i]); // i == array.length - 1
		}
		return res;
	}
	public static void createFile(String name, String data) {
		try(FileWriter fw = new FileWriter(name, false)) {
			fw.write(data);
			//fw.append("\n");
			fw.flush();
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static String getStringFromFile(String name) {
		String res = "";
		try(FileReader reader = new FileReader(name)) {
           // читаем посимвольно
            int c;
            while((c = reader.read()) != -1){
                res = res + ((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return res;
	}
}
