/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiberly
 */
public class Vehiculo {
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo (String marca, double precio, String motor){
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }
    
    @Override
    public String toString(){
        return "Marca = "+this.marca+"\n"+
                "Precio = "+this.precio+"\n"+
                "Motor = "+this.motor+"\n";
    }
    
}
