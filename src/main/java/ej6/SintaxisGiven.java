package ej6;

public class SintaxisGiven extends Gherkins{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output=context.output+"Given ";
            context.input = context.input.substring(4);
        }
    }
}
