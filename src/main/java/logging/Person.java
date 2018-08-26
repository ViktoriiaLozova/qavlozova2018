package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Person {
    private String name;
    private String surname;
    private String email;
    private ChildCount childCount;
    private Pet pet;

    private static Logger logger;

    enum ChildCount {
        ONE,
        TWO,
        TOO_MANY
    }
    enum Pet {
        CAT,
        DOG,
        FISH
    }

    public Person(String name, String surname, String email, int childcount, String pet) {
        setupLog4J();
        this.name = name;
        this.surname = surname;
        this.email = email;
        if (childcount == 1){
            this.childCount = ChildCount.ONE;
        } else if (childcount == 2) {
            this.childCount = ChildCount.TWO;
            Statistics.incrementTwoChildrenCount();
        } else if (childcount > 2) {
            this.childCount = ChildCount.TOO_MANY;
        } else {
            logger.warn("Not valid child count");
        }

        if (pet.toLowerCase().equals(Pet.CAT.name().toLowerCase())){
            this.pet = Pet.CAT;
            Statistics.incrementCatsCount();
        } else if (pet.toLowerCase().equals(Pet.DOG.name().toLowerCase())) {
            this.pet = Pet.DOG;
        } else if (pet.toLowerCase().equals(Pet.FISH.name().toLowerCase())) {
            this.pet = Pet.FISH;
        } else {
            logger.warn("Not valid pet");
        }

        Statistics.incrementPersonCount();
    }

    private static void setupLog4J(){
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        logger = Logger.getLogger(Person.class.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ChildCount getChildCount() {
        return childCount;
    }

    public void setChildCount(ChildCount childCount) {
        this.childCount = childCount;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void print() {
        logger.info("Name: " + name + " Surname: " + surname + " Email: " + email);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Email: " + email;
    }
}
