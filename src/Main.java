import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        cambioTemperatura celsius = new  cambioTemperatura();

        int celsius1 = celsius.gradosCelsius();
        double cambioFarenheit = celsius.gradosFarenheit(celsius1);
        double cambioKelvin = celsius.gradosKelvin(celsius1);

        System.out.println("La temperatura en celsius es: " + celsius1 + "°");
        System.out.printf("La temperatura convertida en grados Fahrenheit es: %.2f%n", cambioFarenheit);
        System.out.printf("La temperatura convertida en grados Kelvin es: %.2f%n", cambioKelvin);

    }
}