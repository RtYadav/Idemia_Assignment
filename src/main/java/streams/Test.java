package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Test {










    public static void boxOperationWithStream() {
        //IntStream.range(1,200).filter(number -> number %2 !=0).forEach(System.out::println);
       List <Integer>l= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (Integer i :l
             ) {
            if(i==1 || i%2 ==0){
                System.out.println();
            }
        }
    }

}
