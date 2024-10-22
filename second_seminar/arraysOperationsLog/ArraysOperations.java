
// Задача 4. Логирование операций с массивом во время поиска
// минимального и максимального элементов
// Реализуйте метод поиска минимального и максимального элементов массива.
// После нахождения каждого элемента (минимального и максимального),
// сделайте запись в лог-файл log.txt в формате год-месяц-день
// час:минуты {минимальный элемент}, {максимальный элемент}.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArraysOperations {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 4, 8, 3, 1 };
        
        Path path = Path.of("second_seminar/arraysOperationsLog/log.txt");
        if (!Files.exists(path));{
            File myFile = new File(path.toString());
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        findMinMax(arr);

    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        logStep(min, max);

    }

    private static void logStep(int min, int max) {
        String dateTime = curentDateTime();
        StringBuilder dateTimeMinMax = new StringBuilder();
        dateTimeMinMax = dateTimeMinMax.append(dateTime + " " + min + " " + max);

        FileWriter fw = null;
        try {
			fw = new FileWriter("second_seminar/arraysOperationsLog/log.txt", true);
            fw.write(dateTimeMinMax.toString());
            fw.append("\n");
			fw.flush();
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
        finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close the writer: " + e.getMessage());
            }
	    }
    }

    public static String curentDateTime() {
        StringBuilder dateTime = new StringBuilder();
        Date dateNow = new Date();
        SimpleDateFormat currentDateTime = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        dateTime = dateTime.append(currentDateTime.format(dateNow));
        return dateTime.toString();
    }

}