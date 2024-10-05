// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.
// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };
// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCSV {

    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
                           {"John", "30", "New York"},
                           {"Alice", "25", "Los Angeles"},
                           {"Bob", "35", "Chicago"}
                           };
        StringBuilder buildedCSV = new StringBuilder();
        buildedCSV = generateCSV(headers, data);
        String SBToStr = buildedCSV.toString();
        String nameOfCsv = "DB.csv";
        createFile(nameOfCsv, SBToStr);

    }

    public static StringBuilder generateCSV(String[] head, String[][] colums){
        StringBuilder buildedCSV = new StringBuilder();
        String tempStr = new String();
        tempStr = String.join(", ", head);
        buildedCSV = buildedCSV.append(tempStr);
        for(int i = 0; i < colums.length; i++){
            buildedCSV = buildedCSV.append("\n");
            tempStr = String.join(", ", colums[i]);
                buildedCSV = buildedCSV.append(tempStr);
        }
        return buildedCSV;
    }

    public static void createFile(String name, String data) {
		try(FileWriter fw = new FileWriter("second_seminar/generateCSV/" + name, false)) {
			fw.write(data);
			fw.flush();
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}