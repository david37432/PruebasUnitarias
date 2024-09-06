package edu.unisabana.dyas.tdd.registry;
import java.util.HashSet;
import java.util.Set;
public class Registry {
    private Set<Integer> registeredIds = new HashSet<>();

    public RegisterResult registerVoter(Person p) {
        // TODO Valoidate person and return real result.

        if (p.getAge()<18){
            return RegisterResult.UNDERAGE;
        }
        else if(p.getAge()>120){
            return RegisterResult.INVALID_AGE;
        }
        else if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }
        else if (registeredIds.contains(p.getId())) {
            return RegisterResult.DUPLICATED;
        }
        else{
            registeredIds.add(p.getId());
            return RegisterResult.VALID;
        }
        
    }
}