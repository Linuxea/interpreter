package interprter;

public class InterpreterContext {

    public static Interpreter fromExpress(String express, Interpreter one, Interpreter two) {
        Interpreter interpreter = null;
        switch (express) {
            case "+" : interpreter = new AddInterpreter(one, two);break;
            case "-" : interpreter = new SubInterpreter(one, two);break;
            case "*" : interpreter = new MultipleInterpreter(one, two);break;
            case "/" : interpreter = new DivInterpreter(one, two);break;
            default: throw new UnsupportedOperationException();
        }

        return interpreter;
    }

}
