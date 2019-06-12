package algorithm;

/**
 * 所有数的结果都要放到这里面
 */
public class Tree {


    public class Node {
        public int data;//节点数据
        public Node leftChild;//左子节点的引用
        public Node rightChild;//右子节点的引用

        public Node(int data) {
            this.data = data;
        }

        //打印节点内容
        public void display() {
            System.out.println("当前的值是：" + data + "");
        }
    }

    public Node root;

    public Node find(int key) {
        Node currentNode = root;
        if (currentNode == null) {
            return null;
        }
        while (currentNode != null) {
            if (currentNode.data > key) {
                currentNode = currentNode.leftChild;
            } else if (currentNode.data < key) {
                currentNode = currentNode.rightChild;
            } else {
                return currentNode;
            }
        }

        return null;

    }

    public boolean insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return true;

        }
        Node currentNode = root;
        Node parentNode = null;
        while (currentNode != null) {
            parentNode = currentNode;
            if (currentNode.data > key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parentNode.leftChild = newNode;
                    return true;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parentNode.rightChild = newNode;
                    return true;
                }
            }

        }

        return false;

    }

    public void preOrder(Node currentNode) {
        currentNode.display();
        preOrder(currentNode.leftChild);
        preOrder(currentNode.rightChild);
    }


    public void middleOrder(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        middleOrder(currentNode.leftChild);
        System.out.println(currentNode.data + "");
        middleOrder(currentNode.rightChild);
    }

    public Node findMin() {
        Node maxNode = null;
        Node currentNode = root;
        while (currentNode != null) {
            maxNode = currentNode;
            currentNode = currentNode.leftChild;

        }
        return maxNode;
    }

    public Node findMax() {
        Node maxNode = null;
        Node currentNode = root;
        while (currentNode != null) {
            maxNode = currentNode;
            currentNode = currentNode.rightChild;
        }
        return maxNode;
    }

    /**
     * 树的深度
     */
    public int treeDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int a = treeDepth(root.leftChild) + 1;
        int b = treeDepth(root.rightChild) + 1;
        int deep = a > b ? a : b;
        return deep;
    }


    public static void main(String[] args) {
        System.out.println("ok");
        Tree tree = new Tree();
        int[] arr = {1, 5, 4, 3, 2, 6};
        for (int x : arr) {
            tree.insert(x);
        }

//        tree.middleOrder(tree.root);

        System.out.println(tree.treeDepth(tree.root));

//        tree.findMin().display();
//        tree.findMax().display();


    }
}
