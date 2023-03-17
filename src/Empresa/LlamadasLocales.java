package Empresa;

import java.util.Scanner;

public class LlamadasLocales extends LineasTelefonicas{

    private String Zona_rural;


    public LlamadasLocales(int tarifa, int numero_llamdas, int duracion, double costo, String zona_rural){
        super(tarifa,numero_llamdas,duracion,costo);

        this.Zona_rural = zona_rural;
    }

    public String getZona_rural() {
        return Zona_rural;
    }

    public void setZona_rural(String zona_rural) {
        Zona_rural = zona_rural;
    }


    @Override
    public String toString() {
        return super.toString()+ " Llamadas Locales: " +
                "\n Zona_rural = " + getZona_rural();
    }

    public String llamadaEntrante1(){
        Scanner entrada = new Scanner(System.in);
        ;

    }
}
