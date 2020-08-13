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
public abstract class Auto  {
    
    private Automovil automovil = new Automovil();
    
    abstract public void encender();

    abstract public void apagar();

    abstract public void frenar();

    abstract public void acelerar();

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    
    
    
}
