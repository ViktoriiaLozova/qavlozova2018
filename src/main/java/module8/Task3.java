package module8;
/*Задание 3
Используйте классы задания 2 модуля 3 для реализации задачи поиска человека по паспортным данным.
Предусмотрите новый класс Passport в котором будут серия и номер паспорта (серия типа String, номер типа Integer).
Создайте несколько экземпляров Passport и Person для установления связи между ними используйте HashMap<Passport, Person>
Для поиска создайте новый экземпляр Passport в который внесите заведомо существующие данные (совпадающие с данными
Passport на предыдущем шаге), проверьте поведение приложения если паспортные данные внесены с ошибкой.
Обратите внимание на поведение HashMap в случае если Passport не имеет методов hashCode и equals
*/

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Passport, Person> map = new HashMap<>();
        Passport passport1 = new Passport("SO", 123);
        Passport passport2 = new Passport("MM", 987);
        Passport passport3 = new Passport("TT", 456);

        Person person1 = new Person("Ivan", "Ivanov", "i@test.com");
        Person person2 = new Person("Petro", "Petrov", "p@test.com");
        Person person3 = new Person("Vasyl", "Vasylev", "v@test.com");

        map.put(passport1, person1);
        map.put(passport2, person2);
        map.put(passport3, person3);

        Passport existingPassport = new Passport("SO", 123);
        Passport nonExistingPassport = new Passport("OO", 555);

        System.out.println(map.get(existingPassport));
        System.out.println(map.get(nonExistingPassport));
    }

}
