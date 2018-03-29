package module3;

/**
 * * Задание 3
 * Создайте класс описывающий односвязный (Singly linked list) список (https://en.wikipedia.org/wiki/Linked_list).
 * Предусмотрите методы добавления в список, удаления из списка и получения элемента списка по индексу
 * Превратите класс Вашего связного списка в двусвязный (Doubly linked list)
 */
public class MainList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.addElement(i);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.getElement(j));
        }
        list.removeElement(3);
        list.removeElement(8);
        System.out.println();
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.getElement(j));
        }
        System.out.println();

        DoublyLinkedList<String> listDouble = new DoublyLinkedList<String>();
        listDouble.addElement("a");
        listDouble.addElement("b");
        listDouble.addElement("c");
        listDouble.addElement("d");
        listDouble.addElement("e");
        for (int j = 0; j < listDouble.size(); j++) {
            System.out.print(listDouble.getElement(j));
        }
        listDouble.removeElement(3);
        listDouble.removeElement(1);
        System.out.println();
        for (int j = 0; j < listDouble.size(); j++) {
            System.out.print(listDouble.getElement(j));
        }
    }
}
