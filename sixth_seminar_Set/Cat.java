package sixth_seminar_Set;

import java.util.Objects;

//import java.util.Objects;

public class Cat {
    public String name; // поле класса, область видимости весь класс

    // конструктор. Он тоже является методом
    public Cat(String name) { //например Leo, эту переменную мы видим только в конструкторе
        this.name = name;
    }

    @Override
    public String toString() {
        // return super.toString();
        return "Cat{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // this - адрес памяти объекта в котором мы находимся, тут проверка равны ли адреса
        if (obj == null || getClass() != obj.getClass()) return false; // вернёт false если сравниваем с нулевым адресом или объекты разных классов
        Cat cat = (Cat)obj;
        return Objects.equals(name, cat.name);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name);
    }

}
