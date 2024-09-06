package registry;


import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person Person = new Person("Jose", 1234567, 25,Gender.MALE,true);RegisterResult result = registry.registerVoter(Person);
        Assert.assertEquals(RegisterResult.VALID, result);

        
    }
    // Todo Complete with more test cases
    @Test 
    public void validateDuplicate(){
        //Este es el caso correcto de nuestra clase de equivalencia
        Person Person = new Person("Juan David", 1234567, 35,Gender.FEMALE,true);
        RegisterResult resultDuplicated = registry.registerVoter(Person);
        Assert.assertEquals(RegisterResult.VALID, resultDuplicated);

        //Este es el caso donde ese id ya esta registrado y por lo tanto deberia salir duplicado
        Person Person2 = new Person("David", 1234567, 25,Gender.MALE,true);
        RegisterResult resultDuplicated2 = registry.registerVoter(Person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, resultDuplicated2);
    }
    @Test
    public void validateMuerte(){
        //Este es el caso correcto o valido de la clase de equivalencia
        Person Person = new Person("Luisa ", 12345678, 21,Gender.FEMALE,true);
        RegisterResult resultAlive = registry.registerVoter(Person);
        Assert.assertEquals(RegisterResult.VALID, resultAlive);

        //Este es el caso donde se supone que la persona esta muerta por lo tanto deberia retornarme que esta muerta la persona
        Person Person1 = new Person("Juan Jose", 12345666, 18,Gender.MALE,false);
        RegisterResult resultAlive1 = registry.registerVoter(Person1);
        Assert.assertEquals(RegisterResult.DEAD, resultAlive1);
    }
    @Test
    public void validarMenor(){
        //Este es el caso correcto donde la persona es mayor de edad 
        Person Person = new Person("Camilo", 52505644, 28,Gender.MALE,true);
        RegisterResult resultUnderAge = registry.registerVoter(Person);
        Assert.assertEquals(RegisterResult.VALID, resultUnderAge);

        //Este es uno de los casos donde la persona es menor edad y deberia mandarme UNDEGRADE ya que es menor de edad 
        Person Person1 = new Person("Daniela", 53707988, 17,Gender.FEMALE,true);
        RegisterResult resultUnderAge1 = registry.registerVoter(Person1);
        Assert.assertEquals(RegisterResult.UNDERAGE, resultUnderAge1);

        //Nos vamos a un caso limite donde la edad va a ser 0 
        Person Person2 = new Person("Mafe", 53707998, 0,Gender.FEMALE,true);
        RegisterResult resultUnderAge2 = registry.registerVoter(Person2);
        Assert.assertEquals(RegisterResult.UNDERAGE, resultUnderAge2);

    }
    @Test
    public void validarEdadReal (){
        //Este es el caso correcto donde la persona tiene 120 años lo cual entra en el rango establecido 
        Person person = new Person("Harold", 22303544, 120,Gender.MALE,true);
        RegisterResult resultInvalidAge = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, resultInvalidAge);

        //Aca nos vamos a un caso donde la persona ya tiene 121 años y por lo tanto no cumple con la edad
        Person person1 = new Person("Danielita", 1234567812, 121,Gender.FEMALE,true);
        RegisterResult resultInvalidAge1 = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.INVALID_AGE, resultInvalidAge1);

        //Aca nos vamos a un caso limite donde la persona se supone que tiene 1000 años 
        Person person2 = new Person("Gabriela", 1234987812, 1000,Gender.FEMALE,true);
        RegisterResult resultInvalidAge2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE, resultInvalidAge2);
        
    }
}


