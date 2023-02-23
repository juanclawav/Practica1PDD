package ej9;

public class Numero5 extends SintaxisRomanos{
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("5")) {
            context.setOutput(context.getOutput() + "V ");
            context.setInput(context.getInput().substring(1));
        }
    }
}
