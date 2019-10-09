package behaviourParameterization.impl;

import behaviourParameterization.generic.Predicate;
import behaviourParameterization.model.Person;
import behaviourParameterization.model.Transaction;

public class GenericTransactionImpl implements Predicate<Transaction> {

    @Override
    public boolean filter(Transaction entity) {
        return entity.getAmount() >5000;
    }
}
