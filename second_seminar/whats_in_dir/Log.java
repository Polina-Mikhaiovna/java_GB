import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
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
