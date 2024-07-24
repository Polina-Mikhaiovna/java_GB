import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directory {
	
	private Logger logger = Log.log(Directory.class.getName()); 

	public static void main(String[] args) {
		writeFileNamesToFile(".", "file.txt");

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

	public static void writeFileNamesToFile(String outpath, String inpath) {
		String[] arr = getFileNameInDir(outpath);
		System.out.println(Arrays.toString(arr));
		try {
			FileWriter fw = new FileWriter(inpath);
			for(int i = 0; i < arr.length; i++) {
				fw.write(arr[i] + "\n");
			}
			fw.flush(); // принудительная запись в файл, до этого данные были в буфере
		}
		catch (IOException ex) {
			Log.logException(ex);
		}
	}
}
