package Empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        int option;

        while (!salir){

            System.out.println("1. Registrar una llamada en alguna de las líneas");
            System.out.println("2. Mostrar la información detallada de cada línea");
            System.out.println("3. Mostrar un consolidado total de la información de todas las líneas");
            System.out.println("4. Reiniciar el uso las líneas telefónicas");
            System.out.println("5. Salir");

            try {
                System.out.println("Elija una opcion: ");
                option = entrada.nextInt();

                switch (option){

                    case 1;
                    break;

                    case 2;
                    break;

                    case 3;
                    break;

                    case 4;
                    break;

                    case 5;
                        salir = true;
                    break;

                    default -> System.out.println("Opcion no valida");



                }

            }catch (InputMismatchException e){
                System.out.println("Debe ser un numero");
                entrada.next();
            }

        }


    }
}