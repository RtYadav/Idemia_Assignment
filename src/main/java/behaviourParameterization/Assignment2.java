package behaviourParameterization;

import behaviourParameterization.helper.DataHelper;
import behaviourParameterization.model.Transaction;
import behaviourParameterization.sort.SortByAmount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Assignment2 {

    private static void sortByAmount(List<Transaction> transactions, Comparator<Transaction> sortByAmount) {
        transactions.sort(sortByAmount);
        transactions.forEach($ -> System.out.println($));
    }

    public static void main(String args[]) {
        sortByAmount(DataHelper.initTransactions(), new SortByAmount());

    }


}
