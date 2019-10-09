package behaviourParameterization.impl;

import behaviourParameterization.PersonPredicate;
import behaviourParameterization.model.Person;

class PersonImpl1 implements PersonPredicate {

    @Override
    public boolean filter(Person person) {
        return (person.getName().startsWith("a") || person.getName().startsWith("m"));

    }

}

