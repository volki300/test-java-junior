/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.py;

/**
 *
 * @author USER
 */
public class AutoDeportivo extends Auto {

    private String tipoAuto;

    public AutoDeportivo() {
        super();
        this.tipoAuto = "Auto Deportivo ";
    }

    @Override
    public void encender() {
        System.out.println("Encedido Auto Deportivo");
    }

    @Override
    public void apagar() {
        System.out.println("Apagado Auto Deportivo");
    }

    @Override
    public void frenar() {
        System.out.println("Frenado Auto Deportivo");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerado Auto Deportivo 100 km/h 5 segundos");
    }

    @Override
    public String toString() {
        return "Tipo Auto=" + tipoAuto + getAutomovil().toString() + '}' ;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

     
}
