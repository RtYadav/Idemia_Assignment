package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment1 {
    public static void printSquare() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List squares = numbers.stream().map($ -> $ * $).collect(Collectors.toList());
        System.out.println(squares);

    }
    public static void printAgeMoreThan20() {
        List<Person> person = new ArrayList();
        person.add(new Person("Arati", 22));
        person.add(new Person("Archana", 24));
        person.add(new Person("Pooja", 20));
        person.add(new Person("Sadhna", 25));

        Stream<Person> moreThan20 = person.stream().filter(p -> p.getAge() > 20);
        moreThan20.forEach($ -> System.out.println($));


    }
    public static void print1stCharUpperRestLower() {
        List<String> l = Arrays.asList("john", "smiTh", "MARRY", "piotr", "Simon", "raHul", "daniaL");

        l.stream().map(str -> Character.toUpperCase(str.charAt(0)) + str.toLowerCase(Locale.forLanguageTag(str.substring(1, str.length())))).forEach(System.out::println);

    }
    public static void main(String args[]) {

        printSquare();
        printAgeMoreThan20();
        print1stCharUpperRestLower();
    }
}
