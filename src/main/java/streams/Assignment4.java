package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Assignment4 {
    private static void listOfDistinctValuesFromArray() {
        Integer[] arr = {1, 2, 3, 3, 3, 4, 5, 6, 6, 6};
        List<Integer> l = Arrays.stream(arr).distinct().collect(Collectors.toList());
        l.forEach(System.out::println);
    }

    private static void SortedWithOnly4Distinct() {
        List<String> list = Arrays.asList("Rahul", "alok", "nivesh", "kiran", "sourabh", "manish", "alok");
        Stream<String> result = list.stream().distinct().limit(4).sorted();
        result.forEach(System.out::println);
    }

    private static void skipAndSorted() {
        List<String> list = Arrays.asList("Rahul", "alok", "nivesh", "kiran", "sourabh", "manish", "rt");
        Stream<String> stringStream = list.stream().skip(2).sorted();
        stringStream.forEach(System.out::println);
    }

    private static void getDistinctChar() {
        List<String> stringList = Arrays.asList("hello", "world");
        // stringList.stream().flatMap(list -> list.chars(IntStream.range(0,list.length()))).distinct();
        stringList.stream().map($ -> $.split(",")).flatMap($ -> Arrays.stream($)).map(str -> str.chars().mapToObj(e -> (char)e)).forEach(System.out::println);
    }
    private static void printCount() {
        System.out.println(IntStream.rangeClosed(0, 500).filter(num -> num % 2 == 0).count());
    }

    private static void matchAnyAllNone() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Arati", 20));
        personList.add(new Person("Sadanand", 20));
        personList.add(new Person("Ajay", 20));
        personList.add(new Person("Amool", 20));

        System.out.println(personList.stream().anyMatch(age -> age.getAge() > 25));
        System.out.println(personList.stream().allMatch(age -> age.getAge() > 25));
        System.out.println(personList.stream().noneMatch(age -> age.getAge() > 25));
    }

    private static void sortPersonBasedOnAge() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Arati",23));
        personList.add(new Person("Rutu",22));
        personList.add(new Person("Ruchi",21));
        personList.add(new Person("Neha",20));
        personList.stream().sorted(Comparator.comparing(str -> str.getName())).map(str -> str.getName()).forEach(System.out::println);
    }
    public static void main(String args[]) {
        // listOfDistinctValuesFromArray();
        //SortedWithOnly4Distinct();
        //skipAndSorted();
        sortPersonBasedOnAge();
        //getDistinctChar();
        //printCount();
        //matchAnyAllNone();


    }




}
