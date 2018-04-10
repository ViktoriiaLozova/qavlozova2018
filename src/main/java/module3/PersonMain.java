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
public class PersonMain {

    public static void main(String[] args) {
        Person girl = new Person("Iryna", "Koval", "girl@test.com");
        Person boy = new Person();

        boy.setName("Ivan");
        boy.setSurname("Ivanov");
        boy.setEmail("boy@test.com");

        girl.print();
        boy.print();
    }
}
