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
    private String modelo;
    private int anio;
    private double precio;
    private double capacidadCarga;
    
    public Vehiculo (String marca,String modelo, int anio, double precio, double capacidadCarga){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.capacidadCarga = capacidadCarga;
    }
    
    //getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
    public double getPrecio(){
        return precio;
    }
    public double getCapacidadCarga(){
        return capacidadCarga;
    }
    
    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    
    public void aplicarDescuento(double procentaje){
        
    }
    
    @Override
    public String toString(){
        return "Vehículo" +
               "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nAño: " + anio +
               "\nPrecio: " + precio +
               "\nCapacidad de carga: " + capacidadCarga + " kg";
    }
    
}
