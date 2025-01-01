public class Main {
        public static void main(String[] args) {

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.addPhone("Ivan Ivanov", "+79169161616");
            phoneBook.addPhone("Ivan Ivanov", "+79379373737");
            phoneBook.addPhone("Peter Petrov", "+79229229292");
            phoneBook.addPhone("Vasiliy Vasilyev", "+79199191919");
            phoneBook.addPhone("Irina Irkova", "+79099099090");
            phoneBook.addPhone("Irina Irkova", "+79019011010");
            phoneBook.addPhone("Irina Irkova", "+79059059595");
            phoneBook.addPhone("Darya Dashina", "+79129121212");

            System.out.println("Телефонная книга (HashMap)");
            System.out.println(phoneBook + "\n");

            System.out.println("Телефонная книга (отсортированная по убыванию количества телефонов)");
            phoneBook.printMoreToLessPhones();

            phoneBook.deletePhone("+79099099090");
            System.out.println("Телефонная книга (после удаления номера +79099099090 методом deletePhone())");
            phoneBook.printMoreToLessPhones();

            phoneBook.deletePerson("Peter Petrov");
            System.out.println("Телефонная книга (после удаления абонента Peter Petrov методом deletePerson())");
            phoneBook.printMoreToLessPhones();

        }

}

