package ej6;

import java.util.ArrayList;
import java.util.List;

public class SintaxisGherkins {

    private List<Gherkins> sintax = new ArrayList<>();
    private Context context;

    public SintaxisGherkins (String input){
        context = new Context(input.replace(" ", ""));
        for (String msg : input.split(" ")){
            switch (msg){
                case "Como":
                    sintax.add(new SintaxisGiven());
                    break;
                case "Quiero":
                    sintax.add(new SintaxisWhen());
                    break;
                case "Para":
                    sintax.add(new SintaxisThen());
                    break;
                default:
                    sintax.add(new SintaxisCualquierPalabra(msg));
                    break;
            }
        }
    }
    public String outputMessage(){
        for (Gherkins sintaxis : sintax){
            sintaxis.interpreter(context);
        }
        return context.output;
    }
}
