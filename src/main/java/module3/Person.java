package module3;

/**
 * Задание 2
 * Напишите приложение калькулятор состоящие из двух классов:
 * Первый класс Person с полями name, surname и email.
 * Напишите два конструктора: один конструктор по умолчанию, второй с аргументами  name,surname, email
 * Напишите метод для вывода информации класса Person на экран
 * Напишите методы для доступа к полям класса Person используя понятия геттер и сеттер
 * (https://dzone.com/articles/why-should-i-write-getters-and-setters)
 * Второй класс должен создать два экземпляра класса Person и, используя метод вывода на экран класса Person,
 * вывести имя, фамилию и email
 * Для полей name, surname и email используйте тип String
 */
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
}
