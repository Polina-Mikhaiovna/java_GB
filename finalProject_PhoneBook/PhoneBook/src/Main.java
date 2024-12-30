import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            PhoneBook phoneBook = new PhoneBook();

            phoneBook.addPhone("John Doe", "123-456-7890");
            phoneBook.addPhone("John Doe", "987-654-3210");
            phoneBook.addPhone("Jane Smith", "555-123-4567");

            System.out.println(phoneBook);
        }

}

