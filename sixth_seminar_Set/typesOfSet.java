package sixth_seminar_Set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class typesOfSet {
    public static void main(String[] args) {

        int array[] = new int[] { 1, 2, 3, 2, 4, 5, 6, 3 };
        HashSet<Integer> set = IntStream.of(array).boxed()
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);

    }
    
}