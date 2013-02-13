package tree;

import tree.nodes.Node;

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public double run() {
        return root.evaluate();
    }
}
