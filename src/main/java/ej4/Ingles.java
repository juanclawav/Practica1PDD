package ej4;

public class Ingles extends Curso{
    @Override
    public void inscribir(Estudiante estudiante) {
        System.out.println("*******************************");
        System.out.println("El estudiante: "+estudiante.getNombre()+" CI: "
                +estudiante.getCi()+" fue inscrito a Ingles.");
    }

}
