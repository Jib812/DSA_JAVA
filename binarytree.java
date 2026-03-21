
class Node {
    int data;
    Node left, right;

    //constructor
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaaryTree {
    Node root;

    void insert(int data) {
        root = insertValue(root, data);
    }

    Node insertValue(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertValue(root.left, data);
        } else if (data > root.data) {
            root.right = insertValue(root.right, data);
        }
        return root;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // count of nodes
    int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return countOfNodes(root.left) + countOfNodes(root.right) + 1;
    }

    // sum of nodes 
    int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }

    // height of tree
    int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // diameter of the tree

    int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int leftDiameter = diameterOfTree(root.left);
        int rightDiameter = diameterOfTree(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    // delete node 
    void delete(int data) {
        root = deleteNode(root, data);
    }

    Node deleteNode(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
        root.data = minValue(root.right);
        root.right = deleteNode(root.right, root.data);

        }
        return root;
    }

    int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
}

public class binarytree {

    public static void main(String[] args) {
        BinaaryTree tree= new BinaaryTree();
        int []values ={4,2,6,9,0,1};
        for (int v : values) {
            tree.insert(v);
        }
        tree.insert(5);
        System.out.print("\npreoder :\n");
        tree.preOrder(tree.root);
        System.out.print("\ninoder :\n");
        tree.inOrder(tree.root);
        System.out.print("\npostooder :\n");
        tree.postOrder(tree.root);

        //count of nodes
        System.out.println("");
        System.out.print(" no of counting nodes are : ");
        System.out.print( tree.countOfNodes(tree.root));

        // sum of nodes
        System.out.println("");
        System.out.println("sum of the nodes : " + tree.sumOfNodes(tree.root));


        tree.delete(2);
        tree.postOrder(tree.root);

        // height of tree
        System.out.println("");
        System.out.println("heaight of the tree is :" + tree.heightOfTree(tree.root));

        // diameter of the tree
        System.out.println("");
        System.out.println("diameter of the tree: " + tree.diameterOfTree(tree.root));
    }
}
