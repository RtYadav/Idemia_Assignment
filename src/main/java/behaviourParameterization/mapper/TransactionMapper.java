package behaviourParameterization.mapper;

import behaviourParameterization.model.Transaction;

public interface TransactionMapper<R> {
    public R map(Transaction transaction);
}
