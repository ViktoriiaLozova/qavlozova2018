package logging;
/*
1. Дополнить программу Person, добавив туда 2 или больше полей, т. к. количество детей, хобби,
пол человека с валидными и невалидными значениями в Enum и/или домашнее животное.
2. Логировать Warning сообщение при создании Person, если пользователь введет невалидное значение.
Программа не должна прекращатся. Например, количество детей = -4 или ввели оленя как домашнее животное, а допустимы
 только кот, собака и попугай (будем традиционными).
3. Создать метод, который бы выводил статистику в формате информационных сообщений: у скольких людей есть коты,
у скольких 2 ребенка или хватает ли людей для создания команды футболистов-любителей
*/

public class Logging {

    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", "ivanov@test.com", 1, "cat");
        Person person2 = new Person("Ivan", "Ivanov", "ivanov@test.com", 2, "cat");
        Person person3 = new Person("Ivanna", "Ivanova", "ivanova@test.com", 3, "dog");
        Person person4 = new Person("Ivanna", "Ivanova", "ivanova@test.com", -8, "Human");
        Statistics.print();
    }

}
