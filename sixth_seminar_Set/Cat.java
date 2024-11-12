package sixth_seminar_Set;

import java.util.Objects;

public class Cat extends Object {
    public String name; // поле класса, область видимости весь класс

    // конструктор. Он тоже является методом
    public Cat(String nameArg) { //например Leo, эту переменную мы видим только в конструкторе
        this.name = nameArg;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return super.toString();
        return "Cat{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat)obj;
        return Object.equals(name, cat.name);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Object.hashCode(name);
    }

}
