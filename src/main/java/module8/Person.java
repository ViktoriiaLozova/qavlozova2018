package module8;

public class Person {
    private String name;
    private String surname;
    private String email;

    public Person() {

    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
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

    public void print() {
        System.out.println("Name: " + name + " Surname: " + surname + " Email: " + email);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Email: " + email;
    }
}
