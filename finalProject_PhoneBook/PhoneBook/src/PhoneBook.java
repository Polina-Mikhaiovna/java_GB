//Функционал
//        **put(K,V)** – добавить пару если или изменить значение,если ключ имеется.
//        **putIfAbsent(K,V)** – произвести добавление если ключ не найден.
//        **get(K)** - получение значения по указанному ключу.
//        **remove(K)** – удаляет пару по указанному ключу.
//        **containsValue(V)** – проверка наличия значения.
//        **containsKey(V)** – проверка наличия ключа.
//        **keySet()** – возвращает множество ключей.
//        **values()** – возвращает набор значений.

import java.util.*;

public class PhoneBook {

    public Map<String, List<String>> namePhone;

    public PhoneBook() {
        this.namePhone = new HashMap<>();
    }

    public void addPhone(String name, String phone) {
        namePhone.putIfAbsent(name, new ArrayList<>());
        // Добавляем номер телефона в список
        namePhone.get(name).add(phone);
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
        for (Map.Entry<String, List<String>> entry : namePhone.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}

