package behaviourParameterization;

import behaviourParameterization.helper.DataHelper;
import behaviourParameterization.model.Transaction;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Assignment4 {
    private static void printTransactionDetailsAsString(List<Transaction> transactions) {
        for (Transaction tr : transactions
        ) {
            //System.out.println(tr.toString());
        }
        // transactions.forEach($ -> System.out.println($));
        transactions.forEach(System.out::println);
    }

    private static void sortAscByTransactionType(List<Transaction> initTransactions) {
        initTransactions.stream().sorted(Comparator.comparing(type -> type.getTransactionType())).forEach(System.out::println);
    }

    private static void sortDescByTransactionType(List<Transaction> initTransactions) {
        initTransactions.stream().sorted(Comparator.comparing(type -> type.getTransactionType(), Comparator.reverseOrder())).forEach(System.out::println);
    }

    private static void sortByAmountUsingAnonymous(List<Transaction> initTransactions) {
        Collections.sort(initTransactions, new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getAmount().compareTo(o2.getAmount());
            }
        });
        System.out.println(initTransactions);
    }
    private static void sortByAmountUsingLambda(List<Transaction> initTransactions) {
        /*Comparator<Transaction> comparator =(Transaction t1 , Transaction t2)->{
            return t1.getAmount().compareTo(t2.getAmount());
        };
        Collections.sort(initTransactions, comparator);*/
        initTransactions.sort(Comparator.comparing(trxn->trxn.getAmount()));
        System.out.println(initTransactions);

    }
    private static void sortByAmountUSingMethodRef(List<Transaction> initTransactions) {
        initTransactions.sort(Comparator.comparing(Transaction::getAmount));

    }

    public static void main(String args[]) {
        // printTransactionDetailsAsString(DataHelper.initTransactions());
        //sortAscByTransactionType(DataHelper.initTransactions());
       // sortDescByTransactionType(DataHelper.initTransactions());
        //sortByAmountUsingLambda(DataHelper.initTransactions());
        sortByAmountUSingMethodRef(DataHelper.initTransactions());
    }




}
