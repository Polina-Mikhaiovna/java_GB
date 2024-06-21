import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Java program to demonstrate the 
// use of listFiles() function 

// public class solution { 
// 	public static void main(String args[]) 
// 	{ 

// 		// try-catch block to handle exceptions 
// 		try { 

// 			// Create a file object 
// 			File f = new File("../../"); 

// 			File[] files = f.listFiles(); 

// 			System.out.println("Files are:"); 

// 			// Display the names of the files 
// 			for (int i = 0; i < files.length; i++) { 
// 				System.out.println(files[i].getName()); 
// 			} 
// 		} 
// 		catch (Exception e) { 
// 			System.err.println(e.getMessage()); 
// 		} 
// 	} 
// } 

public class Directory {

	public static void main(String[] args) {
		String fileInDir = Arrays.toString(getFileNameInDir("."));
		System.out.println(fileInDir);
	}

	public static String[] getFileNameInDir(String path) {
		File dir = new File(path); // объект типа File
		String[] res = new String[0];
		File[] files; // инициализация массива файлов
		if(dir.isDirectory()) { // проверка является ли файл папкой
			files = dir.listFiles(); // инициализация(заполнение) массива файлов файлами
			if(files != null){
				res = new String[files.length]; // передекларируем узнанной длинной
				for (int i = 0; i < files.length; i++ ) {
					res[i] = files[i].getName();
				}
			} else {System.out.println(dir.getName() + " is empty"); }
		} else { System.out.println(dir.getName() + " not a directory"); }
		return res;
	}
}


