package module3;

/**
 * Создайте класс описывающий бинарное дерево (Binary tree — https://en.wikipedia.org/wiki/Binary_tree). В
 качестве данных в вершинах должны быть целые числа
 Предусмотрите возможность добавления элементов в любую из вершин.
 Используя алгоритм поиска в глубину выполните поиск заданного числа в дереве
 */

public class MainTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(10);
        tree.add(9);
        tree.add(14);
        tree.add(12);
        tree.add(7);
        System.out.println(tree.containsValue(12));
    }
}
