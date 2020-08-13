
package auto.py;


public class Automovil {
    private String color;
    private String numChasis;
    private String marca;
    private String ruedas;
    private int kilometraje;
    private int puertas;

    public Automovil() {
    }

    
    public Automovil(String color, String numChasis, String marca, String ruedas, int kilometraje, int puertas) {
        this.color = color;
        this.numChasis = numChasis;
        this.marca = marca;
        this.ruedas = ruedas;
        this.kilometraje = kilometraje;
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(String numChasis) {
        this.numChasis = numChasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return   "color=" + color + ", numChasis=" + numChasis + ", marca=" + marca + ", ruedas=" + ruedas + ", kilometraje=" + kilometraje + ", puertas=" + puertas ;
    }
  
}




