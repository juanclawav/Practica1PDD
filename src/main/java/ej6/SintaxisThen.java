package ej6;

public class SintaxisThen extends Gherkins{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output=context.output+"Then ";
            context.input = context.input.substring(4);
        }
    }
}
