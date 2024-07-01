public class BinaryTree {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    BinaryTree() {
        root = null;
    }

    // Preorder traversal
    void preorder(Node node) {
        if (node == null)
            return;

        // Print data of node
        System.out.print(node.data + " ");
        // Recur on left subtree
        preorder(node.left);
        // Recur on right subtree
        preorder(node.right);
    }

    void preorder() {
        preorder(root);
    }

    // Postorder traversal
    void postorder(Node node) {
        if (node == null)
            return;

        // Recur on left subtree
        postorder(node.left);
        // Recur on right subtree
        postorder(node.right);
        // Print data of node
        System.out.print(node.data + " ");
    }

    void postorder() {
        postorder(root);
    }

    // Count number of nodes
    int countNodes(Node node) {
        if (node == null)
            return 0;

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    int countNodes() {
        return countNodes(root);
    }

    // Count number of leaf nodes
    int countLeafNodes(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;

        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    int countLeafNodes() {
        return countLeafNodes(root);
    }

    // Count number of nodes with specific value
    int countNodesWithValue(Node node, int value) {
        if (node == null)
            return 0;

        int count = (node.data == value) ? 1 : 0;

        return count + countNodesWithValue(node.left, value) + countNodesWithValue(node.right, value);
    }

    int countNodesWithValue(int value) {
        return countNodesWithValue(root, value);
    }

    // A utility function to add a new node with given data
    void add(int data) {
        root = addRecursive(root, data);
    }

    // A recursive function to insert a new data in BST
    Node addRecursive(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }

        if (data < node.data)
            node.left = addRecursive(node.left, data);
        else if (data > node.data)
            node.right = addRecursive(node.right, data);

        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postorder();

        System.out.println("\nCount of nodes is " + tree.countNodes());
        System.out.println("Count of leaf nodes is " + tree.countLeafNodes());
        System.out.println("Count of nodes with value 30 is " + tree.countNodesWithValue(30));
    }
}
