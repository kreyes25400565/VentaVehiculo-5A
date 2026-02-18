/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kiberly
 */
public class Venta {
    private String folio;
    private int cantidadVehiculos;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Venta(String folio, int cantidadVehiculos, Vehiculo vehiculo, Cliente cliente){
        this.folio = folio;
        this.cantidadVehiculos = cantidadVehiculos;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }
    
    public String getFolio(){
        return folio;
    }
    public int getCantidadVehiculo(){
        return cantidadVehiculos;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    public double calcularTotal(){
        
    }
    
    public double aplicarDescuentoPorVolumen(){
        
    }
}
