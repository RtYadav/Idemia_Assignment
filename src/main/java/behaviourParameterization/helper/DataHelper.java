package behaviourParameterization.helper;

import behaviourParameterization.model.Person;
import behaviourParameterization.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Transaction> initTransactions(){
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("Credit",5000));
        transactionList.add(new Transaction("Debit",3000));
        transactionList.add(new Transaction("Withdraw",8000));
        return transactionList;
    }
    public static List<Person> initPersons(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("arati", 25));
        personList.add(new Person("Ruchii", 27));
        personList.add(new Person("Paraggg", 26));
        personList.add(new Person("manu", 26));
        return personList;
    }
}
