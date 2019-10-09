package behaviourParameterization;

import behaviourParameterization.generic.Predicate;
import behaviourParameterization.helper.DataHelper;
import behaviourParameterization.impl.GenericPersonImpl;
import behaviourParameterization.impl.GenericTransactionImpl;
import behaviourParameterization.model.Person;
import behaviourParameterization.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Assignment1 {
    private static void stndAloneFunNamesStatredWithAOrM(List<Person> list) {
        ArrayList resultList = new ArrayList();
        for (Person p : list
        ) {
            if (p.getName().startsWith("a") || p.getName().startsWith("m")) {
                resultList.add(p);
            }

        }
        System.out.println("Result list names started with a or m = " + resultList);
    }

    private static void stndAloneFunNameGrtrThan5CharAndAgeGrtThan20(List<Person> list) {
        ArrayList resultList = new ArrayList();
        for (Person p : list
        ) {
            if (p.getName().length() > 5 && p.getAge() > 20) {
                resultList.add(p);
            }

        }
        System.out.println("Names greater than 5 chars & age greater than 20 = " + resultList);
    }

    private static void polymorphism(List<Person> list, PersonPredicate personPredicate) {
        ArrayList resultList = new ArrayList();
        for (Person p : list
        ) {
            if (personPredicate.filter(p)) {
                resultList.add(p);
            }

        }
        System.out.println("Result list names started with a or m = " + resultList);
    }

    private static void annonymusImpl(List<Person> list, PersonPredicate personPredicate1) {
        ArrayList resultList = new ArrayList();
        for (Person p : list
        ) {
            if (personPredicate1.filter(p)) {
                resultList.add(p);
            }
        }
        System.out.println("Using anonymous class " + resultList);
    }

    private static void lambdaImpl(List<Person> list, PersonPredicate personPredicate2) {
        ArrayList resultList = new ArrayList();
        for (Person p : list
        ) {
            if (personPredicate2.filter(p)) {
                resultList.add(p);
            }
        }
        System.out.println("Using Lambda expression = " + resultList);
        //resultList.forEach(System.out::println);
    }

    private static void getTransactionGreaterThan1000WithGenericImpl(List<Transaction> transactionList, Predicate predicate) {
        ArrayList listCommon = new ArrayList();
        for (Transaction transaction : transactionList
        ) {
            if (predicate.filter(transaction)) {
                listCommon.add(transaction);
            }
        }
        listCommon.forEach(System.out::println);
    }

    private static void maximumTransactionAmount(List<Transaction> transactionList) {
        OptionalInt s = transactionList.stream().mapToInt(amount -> amount.getAmount()).max();
        System.out.println("Maximum transaction amount = " + s);
    }
    private static void getPersonAgeGreaterThan22WithGenericImpl(List<Person> personList,Predicate predicatePerson) {
        ArrayList listCommon = new ArrayList();
        for (Person person : personList
        ) {
            if (predicatePerson.filter(person)) {
                listCommon.add(person);
            }
        }
        listCommon.forEach(System.out::println);
    }

    public static void main(String args[]) {

        //stndAloneFunNamesStatredWithAOrM(DataHelper.initPersons());
        //stndAloneFunNameGrtrThan5CharAndAgeGrtThan20(DataHelper.initPersons());
        // PersonPredicate personPredicate = new FirstImpl();
        // polymorphism(DataHelper.initPersons(),personPredicate);

        /*
        Anonymous class
         */
       /* PersonPredicate personPredicate1 = new PersonPredicate() {
            @Override
            public boolean filter(Person person) {
                return person.getName().length() > 5 && person.getAge() > 20;
            }
        };
        annonymusImpl(DataHelper.initPersons(), personPredicate1);
*/
        PersonPredicate personPredicate2 = (Person person) -> {
            return person.getName().length() > 5 && person.getAge() > 20;
        };

        lambdaImpl(DataHelper.initPersons(), personPredicate2);

        /*
        Generic Calls
         */
        /*Predicate predicate = new GenericTransactionImpl();
        maximumTransactionAmount(DataHelper.initTransactions());
        getTransactionGreaterThan1000WithGenericImpl(DataHelper.initTransactions(), predicate);
*/
        Predicate predicatePerson = new GenericPersonImpl();
        getPersonAgeGreaterThan22WithGenericImpl(DataHelper.initPersons(),predicatePerson);
    }




}
