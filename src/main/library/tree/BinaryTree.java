package main.library.tree;


public class BinaryTree {
    Node root;
    int count = 0;

    public void add(int value) {
        root = Node.addRecursive(root, value);
        count++;
    }

    public void print() {
        print2DUtil(root, 0);
    }

    public void remove(int value) {
        count--;
        root = Node.deleteRecursive(root, value);
    }
    public int size(){
        return count;
    }
    private void print2DUtil(Node root, int space) {
        // Base case
        if (root == null) return;

        // Increase distance between levels
        space += count;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = count; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }

        static Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }
            if (current.value == value) return current;
            if (current.value > value) {
                current.left = addRecursive(current.left, value);
                return current;
            }
            current.right = addRecursive(current.right, value);
            return current;
        }

        static Node deleteRecursive(Node current, int value) {
            if (current == null) return null;
            if (value == current.value) {
                if (current.left == null && current.right == null) {
                    return null;
                }
                if (current.right == null) return current.left;
                if (current.left == null) return current.right;

                int smallestValue = findSmallestValue(current.right);
                current.value = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }
            if (value < current.value){
                current.left = deleteRecursive(current.left,value);
                return current;
            }
            current.right = deleteRecursive(current.right,value);
            return current;


        }
        private static int findSmallestValue(Node root){
            return root.left == null ? root.value:findSmallestValue(root.left);
        }
    }
}