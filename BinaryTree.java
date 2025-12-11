class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    // In-order traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Pre-order traversal (Root, Left, Right)
    void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Post-order traversal (Left, Right, Root)
    void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Creating tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("In-order traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPre-order traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nPost-order traversal: ");
        tree.postorder(tree.root);
    }
}
