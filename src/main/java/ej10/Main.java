package ej10;

public class Main {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("5324GHRR", "Sedan", "Hyundai");
        Vehiculo vh2 = new Vehiculo("2342FGH", "Hatchback", "Toyota");
        Vehiculo vh3 = new Vehiculo("67867HJK", "SUV", "Nissan");
        Vehiculo vh4 = new Vehiculo("3456KJG", "Sedan", "Mercedez");
        Vehiculo vh5 = new Vehiculo("2234QWE", "SUV", "Opel");
        Vehiculo vh6 = new Vehiculo("1234REW", "Truck", "Geely");

        System.out.println("**************************");
        vh1.registro();
        vh1.pagar();
        vh2.registro();
        vh2.pagar();
        vh3.registro();
        vh3.pagar();
        vh4.registro();
        vh4.pagar();
        vh5.registro();
        vh5.pagar();
        vh6.registro();
        vh6.pagar();
        System.out.println("**************************");
    }
}
