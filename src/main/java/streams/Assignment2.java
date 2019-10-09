package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Assignment2 {
    public static void namesStartWithVowel() {
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("rati", 10));
        personSet.add(new Person("Uber", 12));
        personSet.add(new Person("Sady", 13));
        personSet.add(new Person("Emerson", 16));
        personSet.add(new Person("Ola", 18));
        personSet.stream().filter($ -> $.getName().substring(0, 1).equalsIgnoreCase("a")
                || $.getName().substring(0, 1).equalsIgnoreCase("e")
                || $.getName().substring(0, 1).equalsIgnoreCase("i")
                || $.getName().substring(0, 1).equalsIgnoreCase("o")
                || $.getName().substring(0, 1).equalsIgnoreCase("u")
        ).forEach(System.out::println);

    }
    public static void oddNumbers() {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> arrStream = Arrays.stream(arr);
        arrStream.filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    public static void appendHello() {
        String arr[] = {"John", "Sam", "Akash", "Karan", "Sourabh", "Shweta"};
        //Arrays.stream(arr).map(str -> new StringBuffer().append("Hello")+str).forEach(System.out::println);
        Stream<String> stringStream = Arrays.stream(arr);
        Stream.of("John", "Sam", "Akash", "Karan", "Sourabh", "Shweta").map(str -> new StringBuffer().append("Hello") + " " + str).forEach(System.out::println);
    }

    public static void fileOperationWithStream() throws FileNotFoundException {
        File file = new File("/Users/dlpune027/Desktop/arati.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Stream lines = bufferedReader.lines();

        lines.forEach(System.out::println);

    }
    public static void printEvenNumbers() {
        IntStream.range(0,51).filter(number -> number%2 == 0).forEach(System.out::println);
    }
      public static void main(String args[]) throws FileNotFoundException {
          namesStartWithVowel();
          oddNumbers();
          appendHello();
          fileOperationWithStream();
          printEvenNumbers();
      }
}
