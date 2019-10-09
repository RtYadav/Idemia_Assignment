package streams;

import behaviourParameterization.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Assignment3 {

    private static void primeNumberWithGivenRange() {
        IntStream.rangeClosed(1,10).filter(num -> isPrime(num)).boxed().forEach(System.out::println);
    }

    private static boolean isPrime(int num) {
        return num > 1 && IntStream.range(2 ,num).noneMatch(n -> num%n == 0);
    }
    private static void printNameToEachInt() {
        IntStream.rangeClosed(1,10).mapToObj(str -> str + " Arati").forEach(System.out::println);
    }
    private static void sumOfTransactionAmount() {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("a",2000));
        transactionList.add(new Transaction("b",3000));
        transactionList.add(new Transaction("c",4000));
       Integer sum= transactionList.stream().mapToInt(s -> s.getAmount()).sum();
       System.out.println(sum);
    }

    public  static void main(String args[]){
        //primeNumberWithGivenRange();
        // printNameToEachInt();
        sumOfTransactionAmount();
    }




}
