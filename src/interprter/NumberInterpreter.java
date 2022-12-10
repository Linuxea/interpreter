package interprter;

public class NumberInterpreter implements Interpreter{


    private final Integer number;

    public NumberInterpreter(Integer number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }


    @Override
    public int interpret() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.number.toString();
    }
}
