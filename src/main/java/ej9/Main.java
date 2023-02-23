package ej9;

public class Main {
    public static void main(String[] args) {
        String numeros = "1 2 3 4 5 6 7 8 9 10";
        Romanos romanos = new Romanos(numeros);
        String output = romanos.getOutput();
        System.out.println("Output: " + output);
    }
}
