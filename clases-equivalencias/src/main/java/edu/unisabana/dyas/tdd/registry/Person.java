package edu.unisabana.dyas.tdd.registry;
/**
 * Person representation Class
 */
public class Person {
    /**
     * Person's name
     */
    private String name; //Creamos un caso de equivalencia donde ingresamos numeros en el numbre y caracteres especiales, y en el caso de exito un nombre normal
                         //Creamos otro caso de equivalencia donde el nombre tenga 1 caracter o mas de 15, y en el caso de exito un nombre normal 
    /**
     * A person's identification number
     */
    private int id; // Creamos un caso de equivalencia donde ingresamos 11 numeros o 7 numeros y en el caso de exito 10 numeros o 8 numeros 
    /**
     * Person's age
     */
    private int age;
    /**
     * Person's gender
     */
    private Gender gender; // Creamos un caso de equivalencia donde la persona va a terner 17 años o mas de 120 años 
    /**

     * Flag to specify if a person is alive
     */
    private boolean alive; // Aca implementaremos una Clase de equivalencia donde los casos erroneos van a ser muerto o difunto y la correcta va a ser true
    /**
     * The class' default constructor
     */
    public Person() {
        super();
    }
    /**
     * A person constructor with all the information
     *
     * @param name the name
     * @param id the identification number
     * @param age the age
     * @param gender the gender
     * @param alive if the person is alive
     */
    public Person(String name, int id, int age, Gender gender, boolean alive) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
    }
    /**
     * Returns the person's name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the person's identification number *
     * @return the identification Number */
    public int getId() {
        return id;
    }
    /**
     * Returns this person's age
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * Returns the gender
     *
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Returns if the person is alive *
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }
    /**
     * Sets the person's name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the person's identification number *
     * @param id the identification Number to set */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Sets the person's age
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Sets the person's gender
     *
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    /**
     * Sets the flag to specify if this person is alive
     *
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    /**
     * @{inheritdoc}
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", alive=" + alive + "]"; }
}