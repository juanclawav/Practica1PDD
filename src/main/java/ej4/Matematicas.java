package ej4;

public class Matematicas extends Curso{
    @Override
    public void inscribir(Estudiante estudiante) {
        System.out.println("*******************************");
        System.out.println("El estudiante: "+estudiante.getNombre()+" con CI: "
                +estudiante.getCi()+" fue exitosamente inscrito a Matematicas.");
    }
}
