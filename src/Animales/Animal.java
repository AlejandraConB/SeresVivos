package Animales;

public class Animal {

    private String nombre;
    private double peso;

    public void hacerRuido() {
        System.out.println("¡Haciendo ruido!");
    }

    public void accion() {
        System.out.println("¡Movimiento!");
    }
    
    public void segunSuAlimentacion() {
        System.out.println("¡Comida!");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}