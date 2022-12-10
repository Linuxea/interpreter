package interprter;

public class MultipleInterpreter implements Interpreter{

    private final Interpreter oneInterpreter;
    private final Interpreter twoInterpreter;

    public MultipleInterpreter(Interpreter oneInterpreter, Interpreter twoInterpreter) {
        this.oneInterpreter = oneInterpreter;
        this.twoInterpreter = twoInterpreter;
    }


    @Override
    public int interpret() {
        return this.oneInterpreter.interpret() * this.twoInterpreter.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
