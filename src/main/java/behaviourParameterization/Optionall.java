package behaviourParameterization;

import java.util.Optional;

public class Optionall {
    public static void main(String args[]){
        Optional<String> optionalInteger = Optional.empty();
        System.out.println(optionalInteger.orElseGet(() -> print()));
    }

    private static String print() {
        return "Arati";
    }
}
