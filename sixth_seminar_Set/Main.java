package sixth_seminar_Set;

import java.util.*;

public class Main {
    Cat cat = new Cat("Tom");
    Cat cat1 = new Cat("Leo");

    HashSet<Cat> cats = new HashSet<>();

    cats.add(cat);
    cats.add(cat1);

    System.out.println(cats);
    
}

