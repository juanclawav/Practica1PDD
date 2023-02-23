package ej7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Profix profix = new Profix("Sandra Arjona");
        List<Empleado> empleadosProfix = List.of(new Empleado("Soza", "722443"),
                new Empleado("Peredo", "246754"), new Empleado("Loayza", "045334"));
        profix.setEmpleados(empleadosProfix);

        Medusa medusa = new Medusa("Juan Jose");
        Empleado[] empleadosMedusa = { new Empleado("Mamani", "KKL85"),
                new Empleado("Reyes", "LL751") };
        medusa.setEmpleado(empleadosMedusa);

        Ares ares = new Ares("Kevin Sanchez");
        Vector<Empleado> empleadosAres = new Vector<>();
        empleadosAres.add(new Empleado("Luciana", "OO8410"));
        empleadosAres.add(new Empleado("Pompe", "PPP00"));
        ares.setEmpleados(empleadosAres);

        Dradler dradler = new Dradler("Pablo Perez");
        Stack<Empleado> empleadosDradler = new Stack<>();
        empleadosDradler.push(new Empleado("Espinoza", "KLJUJ710"));
        empleadosDradler.push(new Empleado("Carrasco", "QQ42"));
        dradler.setEmpleados(empleadosDradler);

        HashMap<String, Empleado> listaFinal = new HashMap<>();
        Iterator iterator = profix.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = medusa.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = ares.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        iterator = dradler.createIterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            listaFinal.put(empleado.getCi(), empleado);
        }

        listaFinal.get("045334").showInfo();
        listaFinal.get("QQ42").showInfo();
        listaFinal.get("LL751").showInfo();
        listaFinal.get("PPP00").showInfo();
    }
}
