
package Ejercicio3;

public class Parte {
    private String nombre;
    private double peso; // en kg

    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrar_info() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
