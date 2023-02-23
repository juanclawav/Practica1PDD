package ej2;

public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargarHoraria(80);
        contrato.setCursoEducacionSuperior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");
        contrato.setNombre("");
        contrato.setApellido("");

        Contrato c1 = contrato.clone();
        Contrato c2 = contrato.clone();
        Contrato c3 = contrato.clone();
        Contrato c4 = contrato.clone();
        Contrato c5 = contrato.clone();
        Contrato c6 = contrato.clone();
        Contrato c7 = contrato.clone();
        Contrato c8 = contrato.clone();
        Contrato c9 = contrato.clone();
        Contrato c10 = contrato.clone();
        Contrato c11 = contrato.clone();
        Contrato c12 = contrato.clone();
        Contrato c13 = contrato.clone();
        Contrato c14 = contrato.clone();
        Contrato c15 = contrato.clone();

        c1.setNombre("Ernesto");
        c1.setApellido("Loayza");

        c2.setNombre("Andres");
        c2.setApellido("Alvarez");

        c3.setNombre("Alexis");
        c3.setApellido("Villarroel");

        c4.setNombre("Luis");
        c4.setApellido("Laredo");

        c6.setNombre("Alan");
        c6.setApellido("Rangel");

        c7.setNombre("Rodrigo");
        c7.setApellido("Crespo");

        c8.setNombre("Hector");
        c8.setApellido("Perez");

        c9.setNombre("Franz");
        c9.setApellido("Marquez");

        c10.setNombre("Gabriel");
        c10.setApellido("Espana");

        c11.setNombre("Juan");
        c11.setApellido("Alba");

        c12.setNombre("Nataniell");
        c12.setApellido("Urquizo");

        c13.setNombre("Marco");
        c13.setApellido("Perez");

        c14.setNombre("Antronio");
        c14.setApellido("Torrez");

        c15.setNombre("Sandra");
        c15.setApellido("Sanchez");

        c1.showContrato();
        c2.showContrato();
        c3.showContrato();
        c4.showContrato();
        c5.showContrato();
        c6.showContrato();
        c7.showContrato();
        c8.showContrato();
        c9.showContrato();
        c10.showContrato();
        c11.showContrato();
        c12.showContrato();
        c13.showContrato();
        c14.showContrato();
        c15.showContrato();
    }
}
