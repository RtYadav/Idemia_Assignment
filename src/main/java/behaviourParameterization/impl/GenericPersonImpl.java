package behaviourParameterization.impl;

import behaviourParameterization.generic.Predicate;
import behaviourParameterization.model.Person;

public class GenericPersonImpl implements Predicate<Person> {
    @Override
    public boolean filter(Person entity) {
        return entity.getAge() > 25;
    }
}
