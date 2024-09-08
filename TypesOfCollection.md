Перенос с помощью обратного слеша\
*Текст курсивом*
**Жирный текст**
***Текст жирным курсивом***
~~Зачёркнутый текст~~
<u>Подчёркнутый текст</u>

> Оформление цитатой
последовательных строк
внутри одного параграфа

> # Заголовок
> Первый параграф
>
> Второй параграф
>
> > Вложенная цитата
> > > Цитата третьего уровня
>
> Продолжение основной цитаты

- [x] Отмеченный пункт
- [ ] Неотмеченный пункт

1. Пункт
	1. Подпункт
		1. Подподпункт

- Пункт
	- Подпункт
		- Подподпункт


1. Пункт
	- Подпункт
		* Подподпункт


<https://skillbox.ru/media/code/>
[Skillbox Media](https://skillbox.ru/media/) без подсказки
[Skillbox Media](https://skillbox.ru/media/ "Всплывающая подсказка") с подсказкой

![Изображение](https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Markdown-mark.svg/1920px-Markdown-mark.svg.png "Логотип Markdown")





Функция `print (x)` выводит содержимое переменной ```x```.
```с
#include <stdio.h>
int main() {
   printf("Hello, World!");
   return 0;
}
```
**после первой тройки можно указать язык программирования — тогда Markdown правильно подсветит элементы кода.**

```python
	def GB_get_dummies(str column):
    df1 = pd.DataFrame({column:lst})
```
**Столбцы разделяются вертикальными линиями |, а строка с шапкой отделяется от остальных дефисами -, которых можно ставить сколько угодно.**
|Столбец 1|Столбец 2|Столбец 3|
|-|--------|---|
|Длинная запись в первом столбце|Запись в столбце 2|Запись в столбце 3|
|Кртк зпс| |Слева нет записи|
**Чтобы выровнять весь столбец по правому краю, в строке с дефисами сразу после дефисов можно поставить двоеточие :. Чтобы выровнять содержимое по центру, надо поставить двоеточия с обеих сторон.**
|Столбец 1|Столбец 2|Столбец 3|
|:-|:-:|-:|
|Равнение по левому краю|Равнение по центру|Равнение по правому краю|
|Запись|Запись|Запись|

Вот список символов, которые нужно экранировать: \`\*\_\{\}\[\]\<\>\(\)\#\+\-\.\!\|



## List
-
\
Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.
`ArrayList` ("удобный массив") реализовывает `List`
#### Разные способы создания
```java
ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
ArrayList<Integer> list3 = new ArrayList<>(10);
ArrayList<Integer> list4 = new ArrayList<>(list3);
```
#### Функционал

**add(args)** – добавляет элемент в список ( в т.ч. на нужную позицию)
**get(pos)** – возвращает элемент из списка по указанной позиции
**indexOf(item)** – первое вхождение или -1
**lastIndexOf(item)** – последнее вхождение или -1
**remove(pos)** – удаление элемента на указанной позиции и его возвращение
**set(int pos, T item)** – gjvtoftn значение item элементу, который находится
на позиции pos
**void sort(Comparator)** – сортирует набор данных по правилу
**subList(int start, int end)** – получение набора данных от позиции start до end
**clear()** – очистка списка
**toString()** – «конвертация» списка в строку
**Arrays.asList** – преобразует массив в список
**containsAll(col)** – проверяет включение всех элементов из col
**removeAll(col)** – удаляет элементы, имеющиеся в col
**retainAll(col)** – оставляет элементы, имеющиеся в col
**toArray()** – конвертация списка в массив Object’ов
**toArray(type array)** – конвертация списка в массив type
**List.copyOf(col)** – возвращает копию списка на основе имеющегося
**List.of(item1, item2,...)** – возвращает неизменяемый список

Пример:
```java
import java.util.Arrays;
import java.util.List;
public class Ex005_ArraysMethod {
 public static void main(String[] args) {
 StringBuilder day = new StringBuilder("28");
 StringBuilder month = new StringBuilder("9");
 StringBuilder year = new StringBuilder("1990");
 StringBuilder[] date = { day, month, year };
 List<StringBuilder> d = Arrays.asList(date);
 System.out.println(d); // [29, 9, 1990]
 date[1] = new StringBuilder("09");
 System.out.println(d); // [29, 09, 1990]
 }
}
```
```java
import java.util.List;
public class Ex006_ListOf {
 public static void main(String[] args) {
 Character value = null;
 List<Character> list1 =
 List.of('S', 'e', 'r', 'g', 'e', 'y');
 System.out.println(list1);
 // list1.remove(1); // java.lang.UnsupportedOperationException
 List<Character> list2 = List.copyOf(list1);
 // not null, immutable
 }
}
```


##LinkedList

Представляет собой двусвязный список.
Список – гибкая структура данных, позволяющая легко менять свой
размер. Элементы доступны для вставки или удаления в любой позиции.


LinkedList нужен для небольшого количества
элементов, в которых операции добавления\удаления
встречаются чаще операций чтения.


##HashMap

Определение хешей происходи про ключу по хеш-функциям, их можно определять по своему желанию.

Map – это множество коллекций, работающих с данными
по принципу <Ключ / Значение>. 
- ключ уникальный, значение нет.
- ускоренная обработка данных;
- порядок добавления не запоминается.
- в HashMap элементы располагаются как угодно и могут
менять свое положение.

```java
import java.util.*;
public class Ex001_HashMap {
public static void main(String[] args) {
Map<Integer, String> db = new HashMap<>();
db.put(1, "один"); System.out.println(db);
db.put(2, "два"); System.out.println(db);
db.put(3, "три"); System.out.println(db);
db.put(31, "три один"); System.out.println(db);
db.put(13, "один три"); System.out.println(db);
db.put(null, "!null"); System.out.println(db);
db.put(null, null); System.out.println(db);
}
}
```

Функционал
**put(K,V)** – добавить пару если или изменить значение,если ключ имеется.
**putIfAbsent(K,V)** – произвести добавление если ключ не найден.
**get(K)** - получение значения по указанному ключу.
**remove(K)** – удаляет пару по указанному ключу.
**containsValue(V)** – проверка наличия значения.
**containsKey(V)** – проверка наличия ключа.
**keySet()** – возвращает множество ключей.
**values()** – возвращает набор значений.

Map<Integer, String> map1 = new HashMap<>(9, 1.0f);
                                          /   /
                          *кол-во элементов*   *при заполнении на столько процентов*
                                             *будет удвоен размер этого мапа*


##TreeMap

Map упорядоченный по ключу, метод упорядочивания надо выбирать внимательно, особенно присложных ключах, например классах

put(K,V) get(K) remove(K) descendingKeySet(V)
descendingMap() tailMap() headMap() lastEntry() firstEntry()
```java
import java.util.*;
public class Ex004_TreeMap {
public static void main(String[] args) {
TreeMap<Integer,String> tMap = new TreeMap<>();
tMap.put(1,"один"); System.out.println(tMap);
// {1=один}
tMap.put(6,"шесть"); System.out.println(tMap);
// {1=один, 6=шесть}
tMap.put(4,"четыре"); System.out.println(tMap);
// {1=один, 4=четыре, 6=шесть}
tMap.put(3,"три"); System.out.println(tMap);
// {1=один, 3=три, 4=четыре, 6=шесть}
tMap.put(2,"два"); System.out.println(tMap);
// {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
}
}
```



