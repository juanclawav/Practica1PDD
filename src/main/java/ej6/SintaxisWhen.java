package ej6;

public class SintaxisWhen extends Gherkins{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output=context.output+"When ";
            context.input = context.input.substring(6);
        }
    }
}
