package day8;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
        names.forEach(x -> System.out.println("Hello " + x));

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
        int total = numbers.stream()
                .reduce((a,b) -> a*b)
                .get();
        System.out.println(total);
    }



}
