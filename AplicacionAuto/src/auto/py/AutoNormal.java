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
public class AutoNormal extends Auto {

    private String tipoAuto;

    public AutoNormal() {
        super();
        this.tipoAuto = "Auto Normal ";
    }

    @Override
    public void encender() {
        System.out.println("Encedido Auto Normal");
    }

    @Override
    public void apagar() {
        System.out.println("Apagado Auto Normal");
    }

    @Override
    public void frenar() {
        System.out.println("Frenado Auto Normal");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerado Auto Normal");
    }

    @Override
    public String toString() {
        return "Tipo Auto=" + tipoAuto + getAutomovil().toString() + '}';
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    
}
