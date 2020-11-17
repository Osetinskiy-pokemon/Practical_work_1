package RecursionTask4;
public class BST{
    int data;
    BST parent;
    BST left;
    BST right;

    public BST(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}