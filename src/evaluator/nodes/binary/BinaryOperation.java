package evaluator.nodes.binary;

import evaluator.Node;
import evaluator.Type;
import evaluator.calculators.CalculateEvaluate;
import evaluator.calculators.Evaluate;
import evaluator.nodes.Operation;
import evaluator.nodes.Operator;

public class BinaryOperation extends Operation {

    private final Operator operator;
    private final Node leftChild, rightChild;
    private Evaluate evaluate = new CalculateEvaluate();

    public BinaryOperation(Operator operation, Node leftChild, Node rightChild) {
        this.operator = operation;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Operator getOperator() {
        return operator;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public Type evaluate() {
        Type left = getLeftChild().evaluate();
        Type right = getRightChild().evaluate();
        return evaluate.calculate(operator, left, right);
    }

    @Override
    public String parse() {
        return getLeftChild().parse() + getOperator().getOperator() + getRightChild().parse();
    }
}
