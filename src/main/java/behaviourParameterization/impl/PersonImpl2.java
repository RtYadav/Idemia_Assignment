package behaviourParameterization.impl;

import behaviourParameterization.PersonPredicate;
import behaviourParameterization.model.Person;

public class PersonImpl2 implements PersonPredicate {

    @Override
    public boolean filter(Person person) {

        return (person.getName().length() > 5 && person.getAge() > 20);              // Condition2 : More than 5 characters and age grater than 20

    }
}


