package module3;

/**
 * Создайте класс описывающий бинарное дерево (Binary tree — https://en.wikipedia.org/wiki/Binary_tree). В
 качестве данных в вершинах должны быть целые числа
 Предусмотрите возможность добавления элементов в любую из вершин.
 Используя алгоритм поиска в глубину выполните поиск заданного числа в дереве
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

