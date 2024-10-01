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

public class GenerateCSV {

    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
                           {"John", "30", "New York"},
                           {"Alice", "25", "Los Angeles"},
                           {"Bob", "35", "Chicago"}
                           };
        System.out.println(generateCSV(headers, data));
    }

    public static StringBuilder generateCSV(String[] head, String[][] data){
        StringBuilder buildedCSV = new StringBuilder();
        String tempStr = new String();
        tempStr = String.join(", ", head);
        buildedCSV = buildedCSV.append(tempStr);
        for(int i = 0; i < data.length; i++){
            buildedCSV = buildedCSV.append("\n");
            tempStr = String.join(", ", data[i]);
                buildedCSV = buildedCSV.append(tempStr);
        }
        return buildedCSV;
    }
}