package logging;

import org.apache.log4j.Logger;

import java.io.File;
import java.net.MalformedURLException;

public class Person {
    private String name;
    private String surname;
    private String email;
    private ChildCount childCount;
    private Pet pet;

    private static Logger logger;

    enum ChildCount {
        One,
        Two,
        TooMany
    }
    enum Pet {
        Cat,
        Dog,
        Fish
    }

    public Person(String name, String surname, String email, int childcount, String pet) {
        setupLog4J();
        this.name = name;
        this.surname = surname;
        this.email = email;
        if (childcount == 1){
            this.childCount = ChildCount.One;
        } else if (childcount == 2) {
            this.childCount = ChildCount.Two;
        } else if (childcount > 2) {
            this.childCount = ChildCount.TooMany;
        } else {
            logger.warn("Not valid child count");
        }

        if (pet.toLowerCase().equals(Pet.Cat.name().toLowerCase())){
            this.pet = Pet.Cat;
        } else if (pet.toLowerCase().equals(Pet.Dog.name().toLowerCase())) {
            this.pet = Pet.Dog;
        } else if (pet.toLowerCase().equals(Pet.Fish.name().toLowerCase())) {
            this.pet = Pet.Fish;
        } else {
            logger.warn("Not valid pet");
        }
    }

    private static void setupLog4J(){
        try {
            System.setProperty("log4j.configuration", new File("src/main/resources", "log4j.properties").toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        logger = Logger.getLogger(Logging.class.getName());
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
        System.out.println("Name: " + name + " Surname: " + surname + " Email: " + email);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Email: " + email;
    }
}
