package ej4;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.setNombre("Jorge");
        est1.setCi("72741");

        String curso = "matematicas";
        FactoryCurso.make(curso).inscribir(est1);

        Estudiante est2 = new Estudiante();
        est2.setNombre("Jose");
        est2.setCi("354222");

        String curso2 = "deporte";
        FactoryCurso.make(curso2).inscribir(est2);

        Estudiante est3 = new Estudiante();
        est3.setNombre("Mariana");
        est3.setCi("323534");

        String curso3 = "ingles";
        FactoryCurso.make(curso3).inscribir(est3);

        Estudiante est4 = new Estudiante();
        est4.setNombre("Adriana");
        est4.setCi("565643");

        String curso4 = "matematicas";
        FactoryCurso.make(curso4).inscribir(est4);

        Estudiante est5 = new Estudiante();
        est5.setNombre("Andres");
        est5.setCi("Marcelo");

        String curso5 = "fisica";
        FactoryCurso.make(curso5).inscribir(est5);
    }
}
