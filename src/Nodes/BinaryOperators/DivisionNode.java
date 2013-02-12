package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

public class DivisionNode extends BinaryOperationNode {

    public DivisionNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        if (getRigthNode().evaluate() == 0.0) {
            throw new RuntimeException("Division by Zero");
        }
        return (getLeftNode().evaluate() / getRigthNode().evaluate());
    }
}
