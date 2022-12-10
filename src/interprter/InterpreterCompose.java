package interprter;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class InterpreterCompose implements Interpreter {

    private final Stack<Interpreter> interpreters = new Stack<>();
    private final String express;

    public InterpreterCompose(String express) {
        this.express = express;
    }

    @Override
    public int interpret() {

        List<String> expresses = Arrays.stream(express.split(" ")).collect(Collectors.toList());
        for (String express : expresses) {
            if(NumberUtil.isNumeric(express)) {
                this.interpreters.push(new NumberInterpreter(express));
            } else {
                Interpreter one = this.interpreters.pop();
                Interpreter two = this.interpreters.pop();
                Interpreter operatorInterpreter = InterpreterContext.fromExpress(express, one, two);
                this.interpreters.push(new NumberInterpreter(operatorInterpreter.interpret()));
            }
        }

        return this.interpreters.pop().interpret();
    }




}
