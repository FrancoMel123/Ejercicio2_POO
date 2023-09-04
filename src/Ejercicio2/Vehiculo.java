/*

Ejercicio 2: Construir un programa que dada una serie de vehiculos caracterizados por su marca,
modelo y precio, imprima las propiedades del vehiculo mas barato. Para ello, se debaran leer por 
teclado las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos.

*/
package Ejercicio2;

public class Vehiculo {
    //Atributos: 
    private String marca;
    private String modelo;
    private float precio;
    
    //metodo constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return " Marca: " + marca + " Modelo: " + modelo + " Precio: " + precio;
        
    }
    
    
    
    
}
