/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.py;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppAuto {

    public static void main(String[] args) {
        ArrayList<Auto> listaAutos = new ArrayList();
        Scanner texto = new Scanner(System.in);
        
        String continuar = "s";
        String busChasis = "";
        String opcion = "";

        Auto autoDeportivo = new AutoDeportivo();
        autoDeportivo.getAutomovil().setMarca("Kia");
        autoDeportivo.getAutomovil().setNumChasis("sd");
        autoDeportivo.getAutomovil().setPuertas(4);
        autoDeportivo.getAutomovil().setRuedas("4");
        autoDeportivo.getAutomovil().setColor("Azul");
        autoDeportivo.getAutomovil().setKilometraje(44545);

        Auto autoNormal = new AutoNormal();
        autoNormal.getAutomovil().setMarca("Tucson Normal");
        autoNormal.getAutomovil().setNumChasis("sn");
        autoNormal.getAutomovil().setPuertas(4);
        autoNormal.getAutomovil().setRuedas("4 normal");
        autoNormal.getAutomovil().setColor("Rojo normal ");
        autoNormal.getAutomovil().setKilometraje(44545);

        listaAutos.add(autoNormal);
        listaAutos.add(autoDeportivo);

        System.out.println(" Autos Disponibles   ");

        while (continuar.equals("s")) {

            for (Auto listaAuto : listaAutos) {
                System.out.println(listaAuto);
            }

            System.out.println(" Elija Nro Chasis si desea buscar:  ");
            busChasis = texto.nextLine();

            for (Auto auto : listaAutos) {
                if (busChasis.equals(auto.getAutomovil().getNumChasis())) {
                    System.out.println(" Auto Selecionado  ");
                    System.out.println(" Elija opción: acelerar, frenar, apagar, encender   ");

                    opcion = texto.nextLine();

                    switch (opcion) {
                        case "acelerar":
                            auto.acelerar();
                            break;
                        case "encender":
                            auto.encender();
                            break;
                        case "frenar":
                            auto.frenar();
                            break;
                        case "apagar":
                            auto.apagar();
                            break;
                        default:
                            System.out.println(" opción incorrecto ");
                    }
                }
            }

            System.out.println(" Elija s para continuar n para salir : ");
            continuar = texto.nextLine();
        }
        System.out.println(" Adios! ");
    }

}
