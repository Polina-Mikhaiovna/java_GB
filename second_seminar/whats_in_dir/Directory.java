import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directory {
	private Logger logger = Log.log(Directory.class.getName()); 
	public static void main(String[] args) {
		writeFileNamesToFile("../../", "file.txt");
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


public class Log {
	static {
		try (FileInputStream in = new FileInputStream("../log.config")) {
			LogManager.getLogManager().readConfiguration(in);
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public static Logger log(String className) {
		return Logger.getLogger(className);
	}

	public static void logException(IOException ex) {
        String logFilePath = "exception_log.txt"; // путь к файлу лога в корне проекта
        try (FileWriter logWriter = new FileWriter(logFilePath, true)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = sdf.format(new Date());
            logWriter.write(timestamp + " - " + ex.getMessage() + "\n");
            logWriter.flush();
        } catch (IOException logEx) {
            System.out.println("Error writing to log file: " + logEx.getMessage());
        }
    }
}
