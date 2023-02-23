package ej9;

import java.util.ArrayList;
import java.util.List;

public class Romanos {
    private List<SintaxisRomanos> grammar = new ArrayList<>();
    private Context context;

    public Romanos(String input) {
        context = new Context(input.replace(" ", ""));
        for (String snumber : input.split(" ")) {
            int number = Integer.parseInt(snumber);
            if (number < 5) {
                grammar.add(new Numeros1234());
            } else if (number == 5) {
                    grammar.add(new Numero5());
            } else if (number < 10) {
                grammar.add(new Numeros6789());
            } else {
                grammar.add(new Numero10());
            }
        }
    }

    public String getOutput() {
        for (SintaxisRomanos expression : grammar) {
            expression.interpreter(context);
        }
        return context.getOutput();
    }

}
