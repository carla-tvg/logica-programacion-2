import java.util.Scanner;

public class cambioTemperatura {

    public int gradosCelsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        return scanner.nextInt();
    }

    public double gradosFarenheit(int celsius){

        return celsius * (9.0 / 5) + 32;
    }

    public double gradosKelvin(int celsius){

        return celsius + 273.15;
    }
}

