package com.mycompany.jenkins2;
import java.util.Scanner;

public class Jenkins2 {
    public static boolean dia_laboral(String dia) {
        switch(dia) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                return true;
            case "Sabado":
            case "Domingo":
                return false;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana:");
        String dia = scanner.nextLine();

        if (dia_laboral(dia)) {
            System.out.println(dia + " es dia laboral.");
        } else if (dia.equals("Sabado") || dia.equals("Domingo")) {
            System.out.println(dia + " no es dia laboral.");
        } else {
            System.out.println("Esto no es un dia.");
        }

        scanner.close(); // Es buena práctica cerrar el scanner
    }
}
