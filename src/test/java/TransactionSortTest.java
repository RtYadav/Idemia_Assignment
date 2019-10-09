import behaviourParameterization.model.Transaction;
import behaviourParameterization.helper.DataHelper;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class TransactionSortTest {

    private List<Transaction> transactionList = new ArrayList<>();

    @Before
    public void init(){
        transactionList = DataHelper.initTransactions();
    }
}
