package behaviourParameterization.sort;

import behaviourParameterization.model.Transaction;

import java.util.Comparator;

public class SortByAmount implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o2.getAmount().compareTo(o1.getAmount());
    }
}