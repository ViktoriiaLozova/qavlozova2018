package module3;

import java.util.List;

/**
 * Задание 3
 * Создайте класс описывающий односвязный (Singly linked list) список (https://en.wikipedia.org/wiki/Linked_list).
 * Предусмотрите методы добавления в список, удаления из списка и получения элемента списка по индексу
 * Превратите класс Вашего связного списка в двусвязный (Doubly linked list)
 */
public class SinglyLinkedList<E> {
    private SingleListCell<E> first;
    private int listSize = 0;

    public void addElement(E element) {
        if (first == null) {
            SingleListCell<E> cell = new SingleListCell<E>(element, null);
            first = cell;
            listSize++;
        } else {
            SingleListCell<E> nextCell = new SingleListCell<E>(element, null);
            SingleListCell<E> checkCell = first;
            while (checkCell.next != null) {
                checkCell = checkCell.next;
            }
            checkCell.next = nextCell;
            listSize++;
        }
    }

    public void removeElement(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException("There is no element in the list");
        } else if (index > listSize - 1) {
            throw new IndexOutOfBoundsException("No elements with such index");
        } else if (index == 0) {
            first = first.next;
            listSize--;
        } else {
            SingleListCell<E> checkCell = first;
            int currentIndex = 0;
            while (currentIndex + 1 != index) {
                currentIndex++;
                checkCell = checkCell.next;
            }
            checkCell.next = checkCell.next.next;
            listSize--;
        }
    }

    public E getElement(int index) {
        if (index > listSize - 1) {
            throw new IndexOutOfBoundsException("This index is out of list size");
        }
        int currentIndex = 0;
        SingleListCell<E> checkCell = first;
        while (currentIndex != index) {
            currentIndex++;
            checkCell = checkCell.next;
        }
        return checkCell.element;
    }

    public int size() {
        return listSize;
    }

    private static class SingleListCell<E> {
        E element;
        SingleListCell<E> next;

        SingleListCell(E element, SingleListCell<E> next) {
            this.element = element;
            this.next = next;
        }
    }

}