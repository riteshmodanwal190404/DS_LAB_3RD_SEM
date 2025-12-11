class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BST {

    BSTNode root;

    // Insert a node (recursive)
    BSTNode insert(BSTNode node, int key) {
        if (node == null) {
            return new BSTNode(key);
        }
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        return node;
    }

    // Search a node (recursive)
    boolean search(BSTNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return key < node.data ? search(node.left, key) : search(node.right, key);
    }

    // Delete a node (recursive)
    BSTNode delete(BSTNode node, int key) {
        if (node == null) return null;

        if (key < node.data)
            node.left = delete(node.left, key);
        else if (key > node.data)
            node.right = delete(node.right, key);
        else {
            // node with only one child or no child
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            // node with two children: get the inorder successor (smallest in the right subtree)
            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    // Find minimum value in a subtree
    int minValue(BSTNode node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    // In-order traversal
    void inorder(BSTNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.print("In-order traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nSearching for 40: " + tree.search(tree.root, 40));
        System.out.println("Searching for 90: " + tree.search(tree.root, 90));

        tree.root = tree.delete(tree.root, 20);
        System.out.print("In-order after deleting 20: ");
        tree.inorder(tree.root);
    }
}
