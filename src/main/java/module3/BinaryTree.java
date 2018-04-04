package module3;

/*
 * Создайте класс описывающий бинарное дерево (Binary tree — https://en.wikipedia.org/wiki/Binary_tree). В
 качестве данных в вершинах должны быть целые числа
 Предусмотрите возможность добавления элементов в любую из вершин.
 Используя алгоритм поиска в глубину выполните поиск заданного числа в дереве
 */
public class BinaryTree {
    TreeNode rootNode;

    public void add(int value) {
        if (rootNode == null) {
            TreeNode rootNode = new TreeNode(value);
            this.rootNode = rootNode;
        } else {
            addInternal(rootNode, value);
        }
    }

    private void addInternal(TreeNode node, int value) {
        if (value >= node.val) {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                addInternal(node.right, value);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                addInternal(node.left, value);
            }
        }
    }

    public boolean containsValue(int value) {
        return checkNode(rootNode, value);
    }

    private boolean checkNode(TreeNode node, int value) {
        if (node.val == value){
            return true;
        }
        if (node.left != null && checkNode(node.left, value)) {
            return true;
        }
        if (node.right != null && checkNode(node.right, value)) {
            return true;
        }
        return false;
    }
}
