// Функционал
//        **put(K,V)** – добавить пару если или изменить значение,если ключ имеется.
//        **putIfAbsent(K,V)** – произвести добавление если ключ не найден.
//        **get(K)** - получение значения по указанному ключу.
//        **remove(K)** – удаляет пару по указанному ключу.
//        **containsValue(V)** – проверка наличия значения.
//        **containsKey(V)** – проверка наличия ключа.
//        **keySet()** – возвращает множество ключей.
//        **values()** – возвращает набор значений.
//        **steam()** - API, потоки данных(многопоточность) выполнение разных действий параллельно, не мешая друг другу
//      2 типа методов потока: конвейерные и терминальные
//      Конв - применять методы к элементам потока, изменять, сортировать, элементы
//      Терм - возвращают данные из состояния потока

import java.util.*;

public class PhoneBook {

    public Map<String, List<String>> namePhone;

    public PhoneBook() {
        this.namePhone = new HashMap<>();
    }

    public void addPhone(String name, String phone) {
        namePhone.putIfAbsent(name, new ArrayList<>());
        namePhone.get(name).add(phone);
    }

    /**
     * Выводит отсортированную по убыванию количества элементов в списке значений мапу.
     */
    public void printMoreToLessPhones(){
        namePhone.entrySet().stream()
                .sorted((e1, e2) ->
                Integer.compare(e2.getValue().size(),
                e1.getValue().size()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        System.out.println("\n");
    }

    public void deletePhone(String phone){
        for (Map.Entry<String, List<String>> pair : namePhone.entrySet()){
            List<String> phones = pair.getValue();
            if (phones.contains(phone)){
                phones.remove(phone);
                if (phones.isEmpty()){
                    namePhone.remove(pair.getKey());
                }
            }
        }

    }
    public void deletePerson(String name){
            namePhone.remove(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(namePhone, phoneBook.namePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePhone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> pair : namePhone.entrySet()) {
            sb.append(pair.getKey()).append(": ").append(pair.getValue()).append("\n");
        }
        return sb.toString();
    }
}

