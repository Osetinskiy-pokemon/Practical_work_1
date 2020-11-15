package RecursionTask4;
public class Functions {
    BST root;

    public Functions() {
        this.root = null;
    }

    void insert(BST node, int data) {
        if (node == null) {
            node = new BST(data);
            root = node;
        } else if (data < node.data && node.left == null) {
            node.left = new BST(data);
            node.left.parent = node;
        } else if (data >= node.data && node.right == null) {
            node.right = new BST(data);
            node.right.parent = node;
        } else {
            if (data < node.data) {
                insert(node.left, data);
            } else {
                insert(node.right, data);
            }
        }
    }

    public boolean search(BST node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else {
            if (data < node.data) {
                return search(node.left, data);
            } else {
                return search(node.right, data);
            }
        }
    }

    public void printInOrder(BST node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " - ");
            printInOrder(node.right);
        }
    }

    public void printPostOrder(BST node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " - ");
        }
    }

    public void printPreOrder(BST node) {
        if (node != null) {
            System.out.print(node.data + " - ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
}
