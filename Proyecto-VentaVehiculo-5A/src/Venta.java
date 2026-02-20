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
    public int getCantidadVehiculos(){
        return cantidadVehiculos;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public Cliente getCliente(){
        return cliente;
    }
    
    public double calcularTotal(){
        return cantidadVehiculos * vehiculo.getPrecio();
        
    }
    
    public double aplicarDescuentoPorVolumen(){
        double total = calcularTotal();
        double descuento = 0;
        
        if(cantidadVehiculos >= 10){
            descuento = total * 0.10;
        }else if(cantidadVehiculos >= 5){
            descuento = total * 0.05;
        }
        return total - descuento;
    }
    
    public int obtenerPorcentajeDescuento(){
        if(cantidadVehiculos >=10){
            return 10;
        }else if(cantidadVehiculos >= 5){
            return 5;
        }return 0;
    }
    
    public double obtenerMontoDescuento(){
        double total = calcularTotal();
        return total - aplicarDescuentoPorVolumen();
    }
    @Override
    public String toString(){
        return "Folio: " + folio +
               "\n" + cliente.toString() +
               "\nVehículo: " + vehiculo.getMarca() + " " +
               vehiculo.getModelo() + " " + vehiculo.getAnio();
    }
}
