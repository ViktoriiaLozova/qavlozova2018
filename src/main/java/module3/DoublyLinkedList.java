package module3;

/**
 * Задание 3
 * Создайте класс описывающий односвязный (Singly linked list) список (https://en.wikipedia.org/wiki/Linked_list).
 * Предусмотрите методы добавления в список, удаления из списка и получения элемента списка по индексу
 * Превратите класс Вашего связного списка в двусвязный (Doubly linked list)
 */
public class DoublyLinkedList<E> {
    private DoublyListCell<E> first;
    private int listSize = 0;

    public void addElement(E element) {
        if (first == null) {
            first = new DoublyListCell<E>(element, null, null);
            listSize++;
        } else {
            DoublyListCell<E> checkCell = first;
            while (checkCell.next != null) {
                checkCell = checkCell.next;
            }
            checkCell.next = new DoublyListCell<E>(element, null, checkCell);
            listSize++;
        }
    }

    public void removeElement(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException("There is no element in the list");
        } else if (index > listSize - 1) {
            throw new IndexOutOfBoundsException("No elements with such index");
        } else {
            DoublyListCell<E> checkCell = first;
            int currentIndex = 0;
            while (currentIndex != index) {
                checkCell = checkCell.next;
                currentIndex++;
            }
            if (checkCell.prev != null) {
                checkCell.prev.next = checkCell.next;
            }
            if (checkCell.next != null) {
                checkCell.next.prev = checkCell.prev;
            }
            listSize--;
        }
    }

    public E getElement(int index) {
        if (index > listSize - 1) {
            throw new IndexOutOfBoundsException("This index is out of list size");
        }
        int currentIndex = 0;
        DoublyListCell<E> checkCell = first;
        while (currentIndex != index) {
            currentIndex++;
            checkCell = checkCell.next;
        }
        return checkCell.element;
    }

    public int size() {
        return listSize;
    }

    private static class DoublyListCell<E> {
        E element;
        DoublyListCell<E> next;
        DoublyListCell<E> prev;

        DoublyListCell(E element, DoublyListCell<E> next, DoublyListCell<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

}