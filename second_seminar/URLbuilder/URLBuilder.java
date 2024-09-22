// Задание 1. Формирование URL с параметрами
// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
// передаются в виде строки, где ключи и значения разделены =, а пары
// ключ-значение разделены &. Если значение null, то параметр не должен
// попадать в URL.
//При добавлении первого параметра в URL, не забудьте проверить, есть ли уже символ
// ? в базовом URL. Если он присутствует, параметры должны быть добавлены после
// него. Если его нет, начните с ?.

// Пример:
// params = "query=java&sort=desc&filter=null"
// Результат:
// https://example.com/search?query=java&sort=desc

public class URLBuilder {

    public static void main(String[] args) {
        String baseURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        String buildedURL = buildURL(baseURL, params);
        System.out.println(buildedURL);
    }

    /**
     * @param baseURL
     * @param params
     * @return собранный URL из базового и параметров которые заданы(не == null)
     */
    public static String buildURL(String baseURL, String params) {
        String buildedURL = "";
        StringBuilder URL = new StringBuilder(baseURL);
        String pares[] = params.split("&");
        
        for(int i = 0; i < pares.length; i++) {
            String keyValye[] = pares[i].split("=");
            if (!"null".equals(keyValye[1])) {
                if(i == 0 && !URL.toString().contains("?")) URL.append("?");
                if(i > 0) {URL.append("&");}
                URL.append(keyValye[0]).append("=").append(keyValye[1]);
            }
        }
        buildedURL = URL.toString();

        return buildedURL;
    }
}