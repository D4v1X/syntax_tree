package evaluator.nodes;

public class Operator {
    //private
    //crear metodo publico
    //public static operator get(string symbol)
    //chack operator()
    //operator get (symbol);
    //clase parser abstracta
    //symbolo extend opetator
//        linkedTable.put("+", Operator.add);
//        linkedTable.put("-", Operator.subtract);
//        linkedTable.put("*", Operator.mul);
    public static final Operator add = new Operator("add", '+', OperatorType.BINARY);
    public static final Operator subtract = new Operator("subtract", '-', OperatorType.BINARY);
    public static final Operator mul = new Operator("mul", '*', OperatorType.BINARY);
    
    private String name;
    private final char operator;
    private final OperatorType operatorType;

    public Operator(char operator, OperatorType operatorType) {
        this.operator = operator;
        this.operatorType = operatorType;
    }

    public Operator(String name, char operator, OperatorType operatorType) {
        this(operator, operatorType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }

    public OperatorType getoperatorType() {
        return operatorType;
    }
}
