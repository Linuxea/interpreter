import interprter.InterpreterCompose;

public class Main {
    public static void main(String[] args) {

        String express = "1 2 3 4 * * *";
        InterpreterCompose interpreterCompose = new InterpreterCompose(express);
        int interpret = interpreterCompose.interpret();
        System.out.println(interpret);

    }
}