package behaviourParameterization.generic;

import behaviourParameterization.impl.GenericTransactionImpl;
import behaviourParameterization.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Common {



    public static void main(String args[]) {
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("Withdraw", 3000));
        transactionList.add(new Transaction("Withdraw", 4000));
        transactionList.add(new Transaction("Credited", 5000));
        transactionList.add(new Transaction("Credited", 7000));

      // maximumTransactionAmount(transactionList);

       Predicate predicate = new GenericTransactionImpl();




    }




}
